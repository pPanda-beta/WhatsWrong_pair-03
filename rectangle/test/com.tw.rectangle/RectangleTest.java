package com.tw.rectangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {

    private Rectangle rectangle4x5;
    private Rectangle rectangle3x2;
    private Rectangle square3x3;

    @Before
    public void setup() {
        rectangle3x2 = new Rectangle(3, 2);
        rectangle4x5 = new Rectangle(4, 5);
        square3x3 = Rectangle.createSquare(3);
    }


    @Test
    public void computeAreaShouldReturnAreaGivenLengthAndWidth() {
        double area = rectangle3x2.computeArea();
        assertEquals(6, area, 0);

        area = rectangle4x5.computeArea();
        assertEquals(20, area, 0);
    }

    @Test
    public void computePerimeterShouldReturnAreaGivenLengthAndWidth() {
        double perimeter = rectangle3x2.computePerimeter();
        assertEquals(10, perimeter, 0);

        perimeter = rectangle4x5.computePerimeter();
        assertEquals(18, perimeter, 0);
    }

    @Test
    public void computeAreaOfSquareShouldReturnCorrectly() {
        double area = square3x3.computeArea();
        assertEquals(9, area, 0);
    }
}