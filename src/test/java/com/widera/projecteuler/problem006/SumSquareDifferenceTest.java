package com.widera.projecteuler.problem006;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumSquareDifferenceTest {

    @Test
    public void testWith10() {
        assertEquals(2640L, SumSquareDifference.calculate(10L));
    }

}