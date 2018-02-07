package com.widera.projecteuler.problem010;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void testSumOfPrimesBelowTen() {
        assertEquals(17L, PrimeNumber.parallelRangeClosed(2, 10).sum());
    }

}