package com.widera.projecteuler.problem016;

import java.math.BigInteger;

public class Problem016 {

    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(2).pow(1000);
        System.out.println("Sum of the digits of the number 2^1000: " + new DigitSum(number).sum());
    }

}
