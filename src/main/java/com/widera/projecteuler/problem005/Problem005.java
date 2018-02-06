package com.widera.projecteuler.problem005;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Problem005 {

    public static void main(String[] args) {
        Set<Long> dividedNumbers = LongStream.rangeClosed(1L, 20L).boxed().collect(Collectors.toSet());
        System.out.println("Smallest positive number that is evenly divisible by all of the numbers from 1 to 20: "
            + new SmallestNumberFinder(dividedNumbers).getNumberCanDividedByAllNumbers());
    }

}
