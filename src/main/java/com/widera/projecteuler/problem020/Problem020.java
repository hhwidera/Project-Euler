package com.widera.projecteuler.problem020;

import java.math.BigInteger;
import java.util.Arrays;

public class Problem020 {

    public static void main(String[] args) {
        System.out.println("digit sum of 10!: " + digitSumOfFac(10));
        System.out.println("digit sum of 100!: " + digitSumOfFac(100));
    }

    private static long digitSumOfFac(long number) {
        return Arrays.stream(("" + fac(BigInteger.valueOf(number)))
                .split(""))
                .mapToLong(Long::valueOf)
                .sum();
    }

    private static BigInteger fac(BigInteger number) {
        if (number.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return number.multiply(fac(number.subtract(BigInteger.ONE)));
        }
    }

}
