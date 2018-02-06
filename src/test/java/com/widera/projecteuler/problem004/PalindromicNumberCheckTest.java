package com.widera.projecteuler.problem004;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromicNumberCheckTest {

    @Test
    public void testOneDigitNumberIsPositive() {
        assertTrue(PalindromicNumberCheck.isPalindromicNumber(1L));
    }

    @Test
    public void testTwoDigitNumberIsPositive() {
        long[] positiveNumbers = new long[] {11L, 22L, 33L, 44L, 55L, 66L, 99L};
        for (long number : positiveNumbers) {
            assertTrue(PalindromicNumberCheck.isPalindromicNumber(number));
        }
    }

    @Test
    public void testTwoDigitNumberIsNegative() {
        long[] negativeNumbers = new long[] {10L, 13L, 32L, 90L, 91L, 65L, 42L};
        for (long number : negativeNumbers) {
            assertFalse(PalindromicNumberCheck.isPalindromicNumber(number));
        }
    }

    @Test
    public void testThreeDigitNumberIsNegative() {
        long[] negativeNumbers = new long[] {103L, 123L, 300L, 908L, 917L, 652L, 142L};
        for (long number : negativeNumbers) {
            assertFalse(PalindromicNumberCheck.isPalindromicNumber(number));
        }
    }

    @Test
    public void testThreeDigitNumberIsPositive() {
        long[] positiveNumbers = new long[] {101L, 202L, 333L, 444L, 151L, 999L, 767L};
        for (long number : positiveNumbers) {
            assertTrue(PalindromicNumberCheck.isPalindromicNumber(number));
        }
    }

}