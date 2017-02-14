package com.tw.rectangle;

import org.junit.Test;

import static org.junit.Assert.*;


public class RectangleTest {

    @Test
    public void computeAreaShouldReturnAreaGivenLengthAndWidth () {
        Rectangle rectangle = new Rectangle(10, 5);
        double area = rectangle.computeArea();
        assertEquals(50, area, 0);
    }
}
