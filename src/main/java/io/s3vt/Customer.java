package io.s3vt;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    static Map<Integer, Customer> customerMap = new HashMap<>();
    int id;
    String name;
    Integer tier;

    public Customer(int id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;

        customerMap.put(id, this);
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
