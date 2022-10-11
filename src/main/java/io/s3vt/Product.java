package io.s3vt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Product {
    static HashMap<Integer, Product> productMap = new HashMap<>();
    int id;
    String name;
    String category;
    Double price;
    Set<Order> orders = new HashSet<>();

    public Product(int id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;

        productMap.put(id, this);
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
