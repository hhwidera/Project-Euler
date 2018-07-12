package com.widera.projecteuler.problem025;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class FibonacciNumbersTest {

    @Test
    public void testAsStream() {
        List<BigInteger> firstTwelveNumbers = Arrays.asList(
                BigInteger.valueOf(1),
                BigInteger.valueOf(1),
                BigInteger.valueOf(2),
                BigInteger.valueOf(3),
                BigInteger.valueOf(5),
                BigInteger.valueOf(8),
                BigInteger.valueOf(13),
                BigInteger.valueOf(21),
                BigInteger.valueOf(34),
                BigInteger.valueOf(55),
                BigInteger.valueOf(89),
                BigInteger.valueOf(144)
        );
        assertEquals(firstTwelveNumbers, FibonacciNumbers.asStream().limit(12).collect(Collectors.toList()));
    }
}