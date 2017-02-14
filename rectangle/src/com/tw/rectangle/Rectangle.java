package com.tw.rectangle;


// JOB OF THE CLASS : Geometric rectangle with 4 sides with two opposite sides equal
class Rectangle {

    private double width, length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    double computeArea() {
        return width * length;
    }

    double computePerimeter() {
        return 2 * (width + length);
    }

    static Rectangle createSquare(double side) {
        return new Rectangle(side, side);
    }
}
