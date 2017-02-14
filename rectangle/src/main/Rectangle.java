package main;

public class Rectangle {

    private double width, length;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double computeArea() {
        return width * length;
    }
}
