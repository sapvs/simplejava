package io.s3vt.func;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        BiConsumer<String, String> cons = (s, s2) -> System.out.println(s + " " + s2);
        cons.accept("Sapan", "Vashishth");


        Consumer<String> stringConsumer = System.out::println;

        stringConsumer.andThen(s -> System.out.println(s.toUpperCase())).accept("Sapan");
    }
}
