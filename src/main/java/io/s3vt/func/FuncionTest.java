package io.s3vt.func;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FuncionTest {
    public static void main(String[] args) {

        Function<String, Integer> function = String::length;
        System.out.println(function.apply("Sapan Vashishth"));


        BiFunction<String, String, String> bif = (s, s2) -> s + " " + s2;
        System.out.println(bif.andThen(String::length).apply("Sapan", "Vashishth"));


        BinaryOperator<Integer> bop = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a.equals(b)) ? 0 : -1));
        System.out.println(bop.apply(1, 2));
    }
}
