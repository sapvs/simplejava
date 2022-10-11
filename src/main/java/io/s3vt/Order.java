package io.s3vt;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Order {

    Double billAmount;

    static Map<Integer, Order> orderMap = new HashMap<>();
    int id;
    LocalDate orderDate;
    LocalDate deliveryDate;
    String status;
    Customer customer;
    Set<Product> products = new HashSet<>();

    public Order(int id, LocalDate orderDate, LocalDate deliveryDate, String status, int customerId) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customer = Customer.customerMap.get(customerId);

        orderMap.put(id, this);
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", status='" + status + '\'' +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }
}
