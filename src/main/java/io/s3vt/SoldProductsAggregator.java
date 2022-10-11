/*
  List<SimpleSoldProduct> simpleSoldProducts = products.filter(Objects::nonNull)
                .filter(soldProduct -> soldProduct.getCurrency()!= null)
                .map(soldProduct ->
                        new SimpleSoldProduct(soldProduct.getName(),
                                exchangeService.rate(soldProduct.getCurrency()).orElse(BigDecimal.ZERO).multiply(soldProduct.getPrice())))
                .filter(simpleSoldProduct -> simpleSoldProduct.getPrice().compareTo(BigDecimal.ZERO)>0)
                .collect(Collectors.toList());

        // Total the items.
        BigDecimal total  = simpleSoldProducts.stream().map(SimpleSoldProduct::getPrice)
                .filter(price -> price.compareTo(BigDecimal.ZERO) > 0)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
 */

package io.s3vt;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


interface ExchangeService {
    Optional<BigDecimal> rate(String currency);
}

public class SoldProductsAggregator {

    private final EURExchangeService exchangeService;

    SoldProductsAggregator(EURExchangeService EURExchangeService) {
        this.exchangeService = EURExchangeService;
    }

    SoldProductsAggregate aggregate(Stream<SoldProduct> products) {
        if (Objects.isNull(products)) {
            products = Stream.empty();
        }
        List<SimpleSoldProduct> simpleSoldProducts = products.filter(Objects::nonNull).filter(soldProduct -> soldProduct.getCurrency() != null).map(soldProduct -> new SimpleSoldProduct(soldProduct.getName(), exchangeService.rate(soldProduct.getCurrency()).orElse(BigDecimal.ZERO).multiply(soldProduct.getPrice()))).filter(simpleSoldProduct -> simpleSoldProduct.getPrice().compareTo(BigDecimal.ZERO) > 0).collect(Collectors.toList());

        // Total the items.
        BigDecimal total = simpleSoldProducts.stream().map(SimpleSoldProduct::getPrice).filter(price -> price.compareTo(BigDecimal.ZERO) > 0).reduce(BigDecimal.ZERO, BigDecimal::add);

        return new SoldProductsAggregate(simpleSoldProducts, total);
    }
}

class SoldProductsAggregate {
    List<SimpleSoldProduct> products;
    BigDecimal total;

    public SoldProductsAggregate(List<SimpleSoldProduct> products, BigDecimal total) {
        this.products = products;
        this.total = total;
    }
}

class SimpleSoldProduct {
    String name;
    BigDecimal price;

    public SimpleSoldProduct(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

class SoldProduct {
    String name;
    BigDecimal price;
    String currency;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}

class EURExchangeService implements ExchangeService {

    @Override
    public Optional<BigDecimal> rate(String currency) {
        BigDecimal rate = new BigDecimal(70);
        return Optional.of(rate);
    }
}