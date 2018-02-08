package com.widera.projecteuler.problem011;

public class Point {

    public static Point of(final int x, final int y) {
        return new Point(x, y);
    }

    private final int x;
    private final int y;

    private Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public Point add(final Point other) {
        if (other == null) {
            return new Point(this.x, this.y);
        }
        return new Point(this.x + other.x, this.y + other.y);
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

}
