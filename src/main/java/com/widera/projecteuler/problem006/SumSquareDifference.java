package com.widera.projecteuler.problem006;

final class SumSquareDifference {

    private SumSquareDifference() {}

    /**
     * calculate (a + b + c + ...)^2 - (a^2 + b^2 + c^2 + ...).
     *
     * first part is an multi nominal theorem:
     *  <=> a^2 + b^2 + c^2 + ... + 2ab + 2ac + 2bc + ... - (a^2 + b^2 + c^2 + ...)
     *  <=> a^2 + b^2 + c^2 + ... + 2ab + 2ac + 2bc + ... - a^2 - b^2 - c^2 + ...
     *  <=> 2ab + 2ac + 2bc + ...
     *  <=> 2 * (ab + ac + bc + ...)
     *  very simple :-D
     * @param maxNumber max number of multi nominal theorem as long
     * @return result as long
     */
    public static long calculate(final long maxNumber) {
        long sum = 0L;
        for (int a = 1; a <= maxNumber; a++) {
            for (int b = a + 1; b <= maxNumber; b++) {
                sum += a * b;
            }
        }
        return 2 * sum;
    }

}
