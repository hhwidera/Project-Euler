package com.widera.projecteuler.problem011;

import org.junit.Test;

import static org.junit.Assert.*;

public class GridTest {

    @Test
    public void testX() {
        Grid grid = new Grid();
        assertEquals(20-1, grid.x());
    }

    @Test
    public void testY() {
        Grid grid = new Grid();
        assertEquals(20-1, grid.y());
    }

    @Test
    public void testGetValue() {
        Grid grid = new Grid();
        assertEquals(8L, grid.get(0, 0));
        assertEquals(8L, grid.get(grid.x(), 0));
        assertEquals(1L, grid.get(0, grid.y()));
        assertEquals(48L, grid.get(grid.x(), grid.y()));
    }

    @Test
    public void testGetValueOutOfRange() {
        Grid grid = new Grid();
        assertEquals(0L, grid.get(-1, 0));
        assertEquals(0L, grid.get(grid.x() + 1, 0));
        assertEquals(0L, grid.get(-1, grid.y() + 1));
        assertEquals(0L, grid.get(grid.x() + 1, grid.y() + 1));
    }

}