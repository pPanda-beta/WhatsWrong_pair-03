package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PointTest {

    @Test
    public void checkWhetherPointisValid() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        assertEquals(p1, p2);

        Point p3 = new Point(2, 3);
        assertNotEquals(p1, p3);
    }

    @Test
    public void distanceToPoint()
    {
        double length = new Point(1,2).distanceToPoint(new Point(3,4));
        assertEquals(Math.sqrt((Math.pow(1-3,2)+(Math.pow(2-4,2)))),length, 0.01);

        length = new Point(5,6).distanceToPoint(new Point(7,8));
        assertEquals(Math.sqrt((Math.pow(5-7,2)+(Math.pow(6-8,2)))),length, 0.01);
    }
}
