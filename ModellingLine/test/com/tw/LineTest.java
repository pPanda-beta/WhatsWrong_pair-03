package com.tw;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LineTest {

    @Test
    public void validateLineCheckIfEndPointAreSame() {
        boolean expectedResult = new Line(new Point(1, 2), new Point(1, 2)).validateLine();
        assertEquals(true, expectedResult);
    }

    @Test
    public void calculateLengthGivenTwoPoints()
    {
        double length = new Line(new Point(1, 2), new Point(3, 4)).calculateLength();
        assertEquals(Math.sqrt((Math.pow(1-3,2)+(Math.pow(2-4,2)))),length, 0.01);
    }
}
