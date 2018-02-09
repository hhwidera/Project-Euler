package com.widera.projecteuler.problem014;

import java.util.*;
import java.util.stream.LongStream;

public class Problem014 {

    public static void main(String[] args) {
        System.out.println("Which starting number, under one million, produces the longest chain: "
            +LongStream.range(1L, 1_000_000L)
                .mapToObj(number -> new AbstractMap.SimpleEntry<>(
                        number,
                        sequence(number).size()))
                .max(Comparator.comparing(AbstractMap.SimpleEntry::getValue))
                .orElse(new AbstractMap.SimpleEntry<>(-1L, -1))
        );
    }

    private static List<Long> sequence(final long number) {
        List<Long> resultSequence = new ArrayList<>();
        resultSequence.add(number);
        long lastNumber = number;
        while (lastNumber > 1) {
            if (isEven(lastNumber)) {
                lastNumber /= 2;
            } else {
                lastNumber = 3 * lastNumber + 1;
            }
            resultSequence.add(lastNumber);
        }
        return resultSequence;
    }

    private static boolean isEven(final long lastNumber) {
        return lastNumber % 2 == 0;
    }

}
