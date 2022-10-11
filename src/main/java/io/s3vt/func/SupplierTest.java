package io.s3vt.func;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Return String";

        System.out.println(stringSupplier.get());


        BooleanSupplier supplier = () -> false;
        System.out.println(supplier.getAsBoolean());
    }
}
