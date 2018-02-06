package com.widera.projecteuler.problem004;

class LargestPalindrome {

    private final long lowestNumber;
    private final long highestNumber;

    public LargestPalindrome(int digitNumbers) {
        this.lowestNumber = calculateLowestNumber(digitNumbers);
        this.highestNumber = calculateLowestNumber(digitNumbers + 1) - 1L;
    }

    public long getLargestPalindrome() {
        long largest = -1;
        for (long a = lowestNumber; a <= highestNumber; a++) {
            for (long b = lowestNumber; b <= highestNumber; b++) {
                long number = a * b;
                if (PalindromicNumberCheck.isPalindromicNumber(number) && number > largest) {
                    largest = number;
                }
            }
        }
        return largest;
    }

    private long calculateLowestNumber(final int digits) {
        long result = 1L;
        for (int d = 1; d < digits; d++) {
            result *= 10L;
        }
        return result;
    }

}
