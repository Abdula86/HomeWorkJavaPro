package com.gmail.zavsek.o2;

import java.util.Arrays;

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

interface Athlete {
    void performRunning();
    void performJumping();
}

class Human implements Athlete {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void performRunning() {
        System.out.println(name + " is running");
    }

    @Override
    public void performJumping() {
        System.out.println(name + " is jumping");
    }
}

class Cat implements Athlete {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void performRunning() {
        System.out.println(name + " is running");
    }

    @Override
    public void performJumping() {
        System.out.println(name + " is jumping");
    }
}

class Robot implements Athlete {
    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void performRunning() {
        System.out.println(name + " is running");
    }

    @Override
    public void performJumping() {
        System.out.println(name + " is jumping");
    }
}

interface Obstacle {
    void overcome(Athlete athlete);
}

class RunningTrack implements Obstacle {

    public RunningTrack() {
    }

    @Override
    public void overcome(Athlete athlete) {
        athlete.performRunning();
    }
}

class Wall implements Obstacle {

    public Wall() {
    }

    @Override
    public void overcome(Athlete athlete) {
        athlete.performJumping();
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(5),
                new Triangle(4, 3),
                new Square(6)
        };

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);

        Athlete[] athletes = new Athlete[]{
                new Human("Alice"),
                new Cat("Whiskers"),
                new Robot("Robi")
        };

        Obstacle[] obstacles = new Obstacle[]{
                new RunningTrack(),
                new Wall()
        };

        for (Athlete athlete : athletes) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(athlete);
            }
        }
    }

    public static double calculateTotalArea(Shape[] shapes) {
        return Arrays.stream(shapes)
                .mapToDouble(Shape::calculateArea)
                .sum();
    }
}
