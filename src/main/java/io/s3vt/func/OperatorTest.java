package io.s3vt.func;

import java.util.function.BinaryOperator;

public class OperatorTest {

    public static void main(String[] args) {
        BinaryOperator<String> stringBinaryOperator = (s, s2) -> s + s2;
        System.out.println(stringBinaryOperator.apply("Sapan", "Vashishth"));


    }
}
