package com.widera.projecteuler.problem021;

import java.util.HashSet;
import java.util.Set;

public class Problem021 {

    public static void main(String[] args) {
        Set<Long> amicableNumbers = new HashSet<>();

        for (long number = 1L; number < 10000L; number ++) {
            long sumOfDivisors = Divisors.of(number).sum();
            long sumOfDivisorsOfDivisor = Divisors.of(sumOfDivisors).sum();

            if (sumOfDivisorsOfDivisor == number && sumOfDivisors != number) {
                amicableNumbers.add(number);
            }
        }

        System.out.println("sum of all the amicable numbers under 10000: " +
                amicableNumbers.stream().peek(System.out::println).mapToLong(n -> n).sum());
    }

}

