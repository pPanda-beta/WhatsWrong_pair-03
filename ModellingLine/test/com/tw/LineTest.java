package com.tw;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LineTest {

    @Test(expected = Exception.class)
    public void validateLineCheckIfEndPointAreSame() throws Exception {
        new Line(new Point(1, 2), new Point(1, 2));
    }

    @Test
    public void calculateLengthGivenTwoPoints() throws Exception {
        double length = new Line(new Point(1, 2), new Point(3, 4)).calculateLength();
        assertEquals(Math.sqrt((Math.pow(1 - 3, 2) + (Math.pow(2 - 4, 2)))), length, 0.01);
    }

    @Test
    public void lineEqualityCheckGivenTwoLines() throws Exception {
        boolean expectedResult = new Line(new Point(1, 2), new Point(3, 4)).lineEqualityCheck(new Line(new Point(1, 2), new Point(3, 4)));
        assertEquals(true, expectedResult);
        expectedResult = new Line(new Point(1, 2), new Point(3, 4)).lineEqualityCheck(new Line(new Point(4, 2), new Point(3, 4)));
        assertEquals(false, expectedResult);
        expectedResult = new Line(new Point(3, 4), new Point(1, 2)).lineEqualityCheck(new Line(new Point(1, 2), new Point(3, 4)));
        assertEquals(true, expectedResult);
    }
}
