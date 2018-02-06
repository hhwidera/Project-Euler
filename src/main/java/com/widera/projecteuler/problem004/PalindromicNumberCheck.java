package com.widera.projecteuler.problem004;

final class PalindromicNumberCheck {

    private PalindromicNumberCheck() {}

    public static boolean isPalindromicNumber(final long number) {
        String numberAsString = Long.toString(number);
        return new StringBuilder(numberAsString).reverse().toString().equals(numberAsString);
    }

}
