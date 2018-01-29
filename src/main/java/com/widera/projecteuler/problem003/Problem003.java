package com.widera.projecteuler.problem003;

import java.util.Comparator;
import java.util.List;

public class Problem003 {

    public static void main(String[] args) {
        System.out.println(new PrimeFactorCalculator(13195L).get());

        List<Long> primeFactorList = new PrimeFactorCalculator(600_851_475_143L).get();
        System.out.println(primeFactorList);
        System.out.println(primeFactorList.stream().max(Comparator.naturalOrder()).get());
    }

}
