package com.widera.projecteuler.problem008;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreatestProductTest {

    @Test
    public void testFourDigits() {
        assertEquals(5832L, new GreatestProduct(Problem008.NUMBER, 4).greatestProduct());
    }

}