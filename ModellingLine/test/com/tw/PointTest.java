package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PointTest {

    @Test
    public void checkWhetherPointisValid()
    {
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
        assertEquals(p1,p2);

        Point p3 = new Point(2,3);
        assertNotEquals(p1,p3);
    }


}
