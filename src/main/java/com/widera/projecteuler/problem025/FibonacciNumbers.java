package com.widera.projecteuler.problem025;

import java.math.BigInteger;
import java.util.stream.Stream;

class FibonacciNumbers {

    static Stream<BigInteger> asStream() {
        return Stream.iterate(
                new BigInteger[] {BigInteger.ONE, BigInteger.ONE},
                pair -> new BigInteger[] {pair[1], pair[0].add(pair[1])})
                .map(pair -> pair[0]);
    }

}
