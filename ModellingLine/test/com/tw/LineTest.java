package com.tw;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LineTest {

    @Test
    public void endPointsOfLineAreEqual(){
        boolean expectedResult= new Line(new Point(1,2),new Point(1,2)).validateLine();
        assertEquals(true,expectedResult);
    }


}
