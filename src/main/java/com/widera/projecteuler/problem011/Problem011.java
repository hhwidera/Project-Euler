package com.widera.projecteuler.problem011;

public class Problem011 {

    public static void main(String[] args) {
        System.out.println("Greatest product of four adjacent numbers in the same direction: "
                + new GreatestProductFinder(new Grid()).find());
    }

}
