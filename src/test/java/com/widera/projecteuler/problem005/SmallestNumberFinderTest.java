package com.widera.projecteuler.problem005;

import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import static org.junit.Assert.assertEquals;

public class SmallestNumberFinderTest {

    @Test
    public void testSmallestNumber() {
        Set<Long> dividedNumbers = LongStream.rangeClosed(1L, 10L).boxed().collect(Collectors.toSet());
        assertEquals(2520L, new SmallestNumberFinder(dividedNumbers).getNumberCanDividedByAllNumbers());
    }

}