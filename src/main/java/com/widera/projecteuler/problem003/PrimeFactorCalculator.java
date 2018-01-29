package com.widera.projecteuler.problem003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactorCalculator {

    private final long number;

    public PrimeFactorCalculator(long number) {
        if (number % 2 == 0) {
            throw new IllegalArgumentException("number " + number + " is even!");
        }
        this.number = number;
    }

    public List<Long> get() {
        if (isPrimeNumber(number)) {
            return Collections.singletonList(number);
        } else {
            return calculatePrimeFactors(number);
        }
    }

    private List<Long> calculatePrimeFactors(final long number) {
        long x = (long) Math.sqrt(number) + 1;
        long r = x * x - number;
        while (!isSquareNumber(r)) {
            r = r + 2 * x + 1;
            x = x + 1;
        }
        long y = (long) Math.sqrt(r);
        long a = x + y;
        long b = x - y;

        List<Long> result = new ArrayList<>();
        result.addAll(new PrimeFactorCalculator(a).get());
        result.addAll(new PrimeFactorCalculator(b).get());
        return result;
    }

    private boolean isSquareNumber(final long number) {
        double sqrt = Math.sqrt(number);
        int x = (int) sqrt;
        return (Math.pow(sqrt,2) == Math.pow(x,2));
    }

    private boolean isPrimeNumber(final long number) {
        for (long n = 2; n < number; n++) {
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }
}
