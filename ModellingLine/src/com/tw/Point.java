package com.tw;

//Job: A 2-D coordinate.
public class Point {
    private double coordinateX;
    private double coordinateY;

    public Point(double X, double Y) {
        this.coordinateX = X;
        this.coordinateY = Y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Double.compare(point.coordinateX, coordinateX) != 0) return false;
        return Double.compare(point.coordinateY, coordinateY) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(coordinateX);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(coordinateY);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    double distanceToPoint(Point p) {
        return Math.sqrt((Math.pow(this.coordinateX - p.coordinateX, 2) + (Math.pow(this.coordinateY - p.coordinateY, 2))));
    }
}
