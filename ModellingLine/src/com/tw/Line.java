package com.tw;

//JOB: 2-D Geometric shape which is straight locus of two points.
public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) throws Exception {
        this.p1 = p1;
        this.p2 = p2;
        if (p1.equals(p2)) {
            throw (new Exception());
        }
    }

    public double calculateLength() {

        return p1.distanceToPoint(p2);
    }

    public boolean lineEqualityCheck(Line line) {
        if ((this.p1.equals(line.p1)) && (this.p2.equals(line.p2)))
        {
            return true;
        }
        else if ((this.p1.equals(line.p2)) && (this.p2.equals(line.p1)))
        {
            return true;
        }
        else
            {
            return false;
        }
    }
}
