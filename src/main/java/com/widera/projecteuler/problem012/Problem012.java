package com.widera.projecteuler.problem012;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.LongStream;

public class Problem012 {

    public static void main(String[] args) {
        Map.Entry<Long, Long> result = LongStream.generate(new TriangleNumberSupplier())
                .mapToObj(number -> new AbstractMap.SimpleEntry<>(
                        number,
                        LongStream.rangeClosed(1, (long)Math.sqrt(number)).filter(factor -> number % factor == 0).count())
                )
                .peek(System.out::println)
                .filter(tuple -> tuple.getValue() >= 500L/2+1)
                .findFirst().orElse(new AbstractMap.SimpleEntry<>(-1L, -1L));

        System.out.println("value of the first triangle number to have over five hundred divisors: "
                + result.getKey() + "= " + (2L * result.getValue()));
    }

}
