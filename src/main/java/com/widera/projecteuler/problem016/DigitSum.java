package com.widera.projecteuler.problem016;

import java.math.BigInteger;

public class DigitSum {

    private final BigInteger number;

    public DigitSum(final BigInteger number) {
        this.number = number;
    }

    public long sum() {
        long result = 0;
        for (String digit : number.toString().split("")) {
            result += Long.valueOf(digit);
        }
        return result;
    }

}
