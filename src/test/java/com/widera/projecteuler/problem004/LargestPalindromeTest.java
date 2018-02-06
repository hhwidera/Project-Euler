package com.widera.projecteuler.problem004;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPalindromeTest {

    @Test
    public void testLargestTwoDigitNumber() {
        LargestPalindrome lp = new LargestPalindrome(2);
        assertEquals(9009L, lp.getLargestPalindrome());
    }

}