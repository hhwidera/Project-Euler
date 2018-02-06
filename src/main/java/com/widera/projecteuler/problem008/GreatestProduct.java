package com.widera.projecteuler.problem008;

public class GreatestProduct {

    private final String number;
    private final int adjacentDigits;

    public GreatestProduct(final String number, final int adjacentDigits) {
        this.number = number;
        this.adjacentDigits = adjacentDigits;
    }

    public long greatestProduct() {
        long greatestProduct = -1;
        for (int position = 0; position <= number.length() - adjacentDigits; position++) {
            long product = 1;
            for (int productPosition = position; productPosition < position + adjacentDigits; productPosition++) {
                product *= Long.valueOf(""+number.charAt(productPosition));
            }
            if (product > greatestProduct) {
                greatestProduct = product;
            }
        }
        return greatestProduct;
    }

}
