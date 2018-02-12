package com.widera.projecteuler.problem010;

import java.util.stream.LongStream;

public class PrimeNumber {

    public static LongStream parallelRangeClosed(long min, long max) {
        if (min < 2) {
            throw new IllegalArgumentException("min is lower 2!");
        }
        if (max < min) {
            throw new IllegalArgumentException("max is lower min!");
        }
        return LongStream.rangeClosed(min, max)
                .parallel()
                .filter(number -> number == 2 || number % 2 > 0)
                .filter(number -> LongStream.rangeClosed(2, (int)Math.sqrt(number)).allMatch(j -> number%j != 0));
    }

}
