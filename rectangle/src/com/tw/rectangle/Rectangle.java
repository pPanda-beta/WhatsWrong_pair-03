package com.tw.rectangle;

class Rectangle {

    private double width, length;
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    double computeArea() {
        return width * length;
    }
}
