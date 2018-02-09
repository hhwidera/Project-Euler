package com.widera.projecteuler.problem012;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleNumberSupplierTest {

    @Test
    public void test() {
        TriangleNumberSupplier stream = new TriangleNumberSupplier();
        assertEquals(1L, stream.getAsLong());
        assertEquals(3L, stream.getAsLong());
        assertEquals(6L, stream.getAsLong());
        assertEquals(10L, stream.getAsLong());
        assertEquals(15L, stream.getAsLong());
        assertEquals(21L, stream.getAsLong());
    }

}