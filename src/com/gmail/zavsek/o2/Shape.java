package com.gmail.zavsek.o2;

interface Shape {
    double getArea();
}

class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

class Square implements Shape {
    private final double side;

    @Override
    public double getArea() {
        return side * side;
    }
}



