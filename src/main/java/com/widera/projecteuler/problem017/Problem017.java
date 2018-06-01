package com.widera.projecteuler.problem017;

import java.util.stream.IntStream;

public class Problem017 {

    public static void main(String[] args) {
        System.out.println("numbers 1 to 5 written out in words: " + calculate(1, 5) + " letters used.");
        System.out.println("numbers 1 to  written out in words: " + calculate(1, 1000) + " letters used.");
    }

    private static int calculate(int start, int end) {
        NumberInWordWriter converter = new NumberInWordWriter();
        return IntStream.rangeClosed(start, end)
                .mapToObj(converter::convertNumberInWords)
                .map(word -> word.replace(" ", "").replace("-", ""))
                .map(String::length)
                .mapToInt(Integer::intValue).sum();
    }

}
