package com.widera.projecteuler.problem016;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class DigitSumTest {

    @Test
    public void test() {
        assertEquals(26L, new DigitSum(BigInteger.valueOf(2L).pow(15)).sum());
    }

}