package com.widera.projecteuler.problem015;

public class Problem015 {

    public static void main(String[] args) {
        System.out.println("Routes for a 20×20 grid: " + calculateRoutes(20));
    }

    /**
     * There are two types of moves: left (L) and right (R).
     * To move in a grid from start (0,0) to end (gird size, grid size), you need grid size * L moves = N_L and grid size * R moves = N_R.
     * Problem is like urn problem without replacement or Binomial coefficient:
     * N = (N_L + N_R)! / ( N_L! * N_R!)
     * For optimizing calculate Binomial coefficient:
     * (n k) = Product_(i=1)^(k) (n - k + i) / i
     * @param gridSize size of grid as long
     * @return possible moves as long
     */
    private static long calculateRoutes(final long gridSize) {
        return binomialCoefficient(2 * gridSize, gridSize);
    }

    private static long binomialCoefficient(final long n, final long k) {
        if (k == 0L) {
            return 1L;
        }
        long result = 1L;
        for (long i = 1L; i <= k; i++) {
            result = result * (n - k + i) / i;
        }
        return result;
    }

}
