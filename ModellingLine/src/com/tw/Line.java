package com.tw;

//JOB: 2-D Geometric shape which is straight locus of two points.
public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean validateLine() {
        if (p1 == p2) {
            return false;
        } else
            return true;
    }

    public double calculateLength() {
        return p1.distanceToPoint(p2);
    }
}
