package io.s3vt.func;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> pred = Objects::isNull;
        System.out.println(pred.and(Objects::nonNull) .test(null));
    }
}
