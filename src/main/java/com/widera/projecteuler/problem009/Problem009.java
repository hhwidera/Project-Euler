package com.widera.projecteuler.problem009;

public class Problem009 {

    public static void main(String[] args) {
        System.out.println("Product of Pythagorean triplet for which a + b + c = 1000: " + productOfTriplet(1000L));
    }

    public static long productOfTriplet(final long sumOfTriplet) {
        for (long a = 0; a < sumOfTriplet/3; a++) {
            for (long b = a + 1; b < sumOfTriplet/2; b++) {
                for (long c = b + 1; c < sumOfTriplet; c++) {
                    if (a + b + c == sumOfTriplet && a * a + b * b == c * c) {
                        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                        return a * b * c;
                    }
                }
            }
        }
        return -1;
    }

}
