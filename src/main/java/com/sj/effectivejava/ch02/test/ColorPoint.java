package com.sj.effectivejava.ch02.test;

import java.awt.*;
import java.util.Set;

public class ColorPoint extends Point {

    private final Color color;
    private static final Set<Point> unitCircle = Set.of(
            new Point(1, 0), new Point(0, 1),
            new Point(-1, 0), new Point(0, -1)
    );

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || o.getClass() != getClass()) {
            return false;
        }
        return super.equals(o) && ((ColorPoint) o).color == color;
    }

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

}
