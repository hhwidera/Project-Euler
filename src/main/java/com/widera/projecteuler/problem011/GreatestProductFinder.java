package com.widera.projecteuler.problem011;

import java.util.ArrayList;
import java.util.List;

public class GreatestProductFinder {

    private enum Direction {
        UP(Point.of(0,0), Point.of(0,-1), Point.of(0,-2), Point.of(0,-3)),
        DOWN(Point.of(0,0), Point.of(0,1), Point.of(0,2), Point.of(0,3)),
        LEFT(Point.of(0,0), Point.of(-1,0), Point.of(-2,0), Point.of(-3,0)),
        RIGHT(Point.of(0,0), Point.of(1,0), Point.of(2,0), Point.of(3,0)),
        DOWN_RIGHT(Point.of(0,0), Point.of(1,1), Point.of(2,2), Point.of(3,3)),
        DOWN_LEFT(Point.of(0,0), Point.of(-1,1), Point.of(-2,2), Point.of(-3,3)),
        UP_RIGHT(Point.of(0,0), Point.of(1,-1), Point.of(2,-2), Point.of(3,-3)),
        UP_LEFT(Point.of(0,0), Point.of(-1,-1), Point.of(-2,-2), Point.of(-3,-3));

        private final Point[] points;

        Direction(Point... points) {
            this.points = points;
        }

        List<Point> getAbsolutePoints(final Point startPoint) {
            List<Point> result = new ArrayList<>();
            for (Point point : points) {
                result.add(startPoint.add(point));
            }
            return result;
        }
    }
    private final Grid grid;

    public GreatestProductFinder(final Grid grid) {
        this.grid = grid;
    }

    public long find() {
        long maxProduct = 0;
        for (int x = 0; x <= grid.x(); x++) {
            for (int y = 0; y <= grid.x(); y++) {
                Point position = Point.of(x, y);
                for (Direction direction : Direction.values()) {
                    long product = direction.getAbsolutePoints(position).stream()
                            .map(pos -> grid.get(pos.x(), pos.y()))
                            .mapToLong(Long::longValue)
                            .reduce(1L, (a, b) -> a * b);
                    if (product > maxProduct) {
                        System.out.println("(" + x + ", " + y + ") " + direction + ": set to " + product);
                        maxProduct = product;
                    }
                }
            }
        }
        return maxProduct;
    }

}
