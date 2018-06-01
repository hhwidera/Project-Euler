package com.widera.projecteuler.problem017;

import java.util.HashMap;
import java.util.Map;

class NumberInWordWriter {

    private static final Map<Integer, String> numberToNineteen = new HashMap<>();
    static {
        numberToNineteen.put(0, "zero");
        numberToNineteen.put(1, "one");
        numberToNineteen.put(2, "two");
        numberToNineteen.put(3, "three");
        numberToNineteen.put(4, "four");
        numberToNineteen.put(5, "five");
        numberToNineteen.put(6, "six");
        numberToNineteen.put(7, "seven");
        numberToNineteen.put(8, "eight");
        numberToNineteen.put(9, "nine");
        numberToNineteen.put(10, "ten");
        numberToNineteen.put(11, "eleven");
        numberToNineteen.put(12, "twelve");
        numberToNineteen.put(13, "thirteen");
        numberToNineteen.put(14, "fourteen");
        numberToNineteen.put(15, "fifteen");
        numberToNineteen.put(16, "sixteen");
        numberToNineteen.put(17, "seventeen");
        numberToNineteen.put(18, "eighteen");
        numberToNineteen.put(19, "nineteen");
    }
    private static final Map<Integer, String> tensPotency = new HashMap<>();
    static {
        tensPotency.put(20, "twenty");
        tensPotency.put(30, "thirty");
        tensPotency.put(40, "forty");
        tensPotency.put(50, "fifty");
        tensPotency.put(60, "sixty");
        tensPotency.put(70, "seventy");
        tensPotency.put(80, "eighty");
        tensPotency.put(90, "ninety");
    }
    private static final String HUNDRED = "hundred";
    private static final String ONE_THOUSAND = "one thousand";

    String convertNumberInWords(final Integer number) {
        if (number < 0) throw new IllegalArgumentException("number is negative");
        if (number < 20) {
            return convertNumberLowerTwenty(number);
        }
        if (number < 100) {
            return convertNumberLowerHundred(number);
        }
        if (number < 1000) {
            return convertNumberLowerThousand(number);
        }
        if (number == 1000) {
            return ONE_THOUSAND;
        }
        throw new IllegalArgumentException("number not converted");
    }

    private String convertNumberLowerThousand(final Integer number) {
        int hundreds = number / 100;
        String result = numberToNineteen.get(hundreds) + " " + HUNDRED;
        if (number - hundreds * 100 > 0) {
            result += " and " + convertNumberInWords(number - hundreds * 100);
        }
        return result;
    }

    private String convertNumberLowerHundred(final Integer number) {
        int potency = number / 10 * 10;
        return tensPotency.get(potency)
                + (number - potency == 0 ? "" : "-" + numberToNineteen.get(number - potency) );
    }

    private String convertNumberLowerTwenty(final Integer number) {
        return numberToNineteen.get(number);
    }
}
