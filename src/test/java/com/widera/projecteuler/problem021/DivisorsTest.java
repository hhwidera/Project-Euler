package com.widera.projecteuler.problem021;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisorsTest {

    @Test
    public void testZero() {
        assertEquals(0L, Divisors.of(0L).count());
    }

    @Test
    public void testOne() {
        assertEquals(0L, Divisors.of(1L).count());
    }

    @Test
    public void testTwo() {
        assertArrayEquals (new long[] {1L}, Divisors.of(2L).toArray());
    }

    @Test
    public void test_220() {
        assertArrayEquals (new long[] {1L, 2L, 4L, 5L, 10L, 11L, 20L, 22L, 44L, 55L, 110L}, Divisors.of(220L).toArray());
    }

    @Test
    public void test_284() {
        assertArrayEquals (new long[] {1L, 2L, 4L, 71L, 142L}, Divisors.of(284L).toArray());
    }
}