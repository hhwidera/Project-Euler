package com.widera.projecteuler.problem005;

import java.util.Set;
import java.util.stream.LongStream;

class SmallestNumberFinder {

    private final Set<Long> dividedNumbers;

    public SmallestNumberFinder(Set<Long> dividedNumbers) {
        this.dividedNumbers = dividedNumbers;
    }

    public long getNumberCanDividedByAllNumbers() {
        LongStream numbers = LongStream.iterate(1L, n -> n + 1L);
        for (long dividedNumber : dividedNumbers) {
            numbers = numbers.filter(number -> number % dividedNumber == 0L);
        }
        return numbers.findFirst().orElse(-1L);
    }

}
