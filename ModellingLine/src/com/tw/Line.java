package com.tw;

public class Line {

    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean validateLine() {
        if(p1==p2){
            return false;
        }
        else
            return true;
    }
}
