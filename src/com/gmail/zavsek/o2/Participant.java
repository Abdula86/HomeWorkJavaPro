package com.gmail.zavsek.o2;

interface Participant {
    void run();
    void jump();
}

class Human implements Participant {
    String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Human " + name + " is running");
    }

    @Override
    public void jump() {
        System.out.println("Human " + name + " is jumping");
    }
}

class Cat implements Participant {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " is running");
    }

    @Override
    public void jump() {
        System.out.println("Cat " + name + " is jumping");
    }
}

class Robot implements Participant {
    String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Robot " + name + " is running");
    }

    @Override
    public void jump() {
        System.out.println("Robot " + name + " is jumping");
    }
}
