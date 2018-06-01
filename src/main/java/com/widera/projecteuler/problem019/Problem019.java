package com.widera.projecteuler.problem019;

public class Problem019 {

    public static void main(String[] args) {
        int count = 0;
        DateIterator dateIterator = new DateIterator();
        while (!dateIterator.isEnd()) {
            if (dateIterator.isDayFirstOfMonthAndWeekdayIsSundayAndInRange()) {
                count++;
                System.out.println("match " + dateIterator.toString());
            }
            dateIterator.nextDay();
        }
        System.out.println("How many Sundays fell on the first of the month during the twentieth century: " + count);
    }

}
