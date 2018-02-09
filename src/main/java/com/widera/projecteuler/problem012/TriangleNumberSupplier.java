package com.widera.projecteuler.problem012;

import java.util.function.LongSupplier;

public class TriangleNumberSupplier implements LongSupplier {

    private long index = 1;
    private long lastNumber = 0;

    @Override
    public long getAsLong() {
        lastNumber += index;
        index++;
        return lastNumber;
    }

}
