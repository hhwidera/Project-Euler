package com.widera.projecteuler.problem021;

import java.util.stream.LongStream;

public class Divisors {

    public static LongStream of(final long number) {
        return LongStream.rangeClosed(1L, number / 2L)
                .filter(possibleDivisor -> number % possibleDivisor == 0);
    }
}
