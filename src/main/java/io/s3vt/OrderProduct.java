package io.s3vt;

public class OrderProduct {

    static void order_product_relationship (int order_id, int product_id){
        Product product = Product.productMap.get(product_id);
        Order order = Order.orderMap.get(order_id);

        order.products.add(product);
        product.orders.add(order);
    }
}
