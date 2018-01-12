package com.widera.projecteuler.problem001;

import java.util.stream.IntStream;

public class Problem001 {

    public static void main(String[] args) {
        System.out.println("sum: " + IntStream.range(1, 1000)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .peek(System.out::println)
                .sum());
    }
}
