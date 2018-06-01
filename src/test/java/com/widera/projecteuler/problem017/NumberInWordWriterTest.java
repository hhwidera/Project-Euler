package com.widera.projecteuler.problem017;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NumberInWordWriterTest {

    @Parameters(name = "{index}: number {0}: {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, "zero"},
                {1, "one"},
                {2, "two"},
                {3, "three"},
                {4, "four"},
                {5, "five"},
                {6, "six"},
                {7, "seven"},
                {8, "eight"},
                {9, "nine"},
                {10, "ten"},
                {11, "eleven"},
                {12, "twelve"},
                {13, "thirteen"},
                {14, "fourteen"},
                {15, "fifteen"},
                {16, "sixteen"},
                {17, "seventeen"},
                {18, "eighteen"},
                {20, "twenty"},
                {30, "thirty"},
                {40, "forty"},
                {50, "fifty"},
                {60, "sixty"},
                {70, "seventy"},
                {80, "eighty"},
                {90, "ninety"},
                {21, "twenty-one"},
                {25, "twenty-five"},
                {32, "thirty-two"},
                {58, "fifty-eight"},
                {64, "sixty-four"},
                {79, "seventy-nine"},
                {83, "eighty-three"},
                {99, "ninety-nine"},
                {100, "one hundred"},
                {200, "two hundred"},
                {300, "three hundred"},
                {400, "four hundred"},
                {500, "five hundred"},
                {600, "six hundred"},
                {700, "seven hundred"},
                {800, "eight hundred"},
                {900, "nine hundred"},
                {1000, "one thousand"},
                {342, "three hundred and forty-two"},
                {115, "one hundred and fifteen"},
        });
    }

    private Integer input;
    private String expected;

    public NumberInWordWriterTest(Integer input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        NumberInWordWriter converter = new NumberInWordWriter();
        assertEquals(expected, converter.convertNumberInWords(input));
    }
}