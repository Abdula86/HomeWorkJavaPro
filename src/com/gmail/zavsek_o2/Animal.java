package com.gmail.zavsek_o2;


class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " run " + distance + " м");
        } else {
            System.out.println(name + " can't run " + distance + " м, maximum running distance - " + maxRunDistance + " м");
        }
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " swam " + distance + " м");
        } else {
            System.out.println(name + " can't swim " + distance + " м, maximum distance for swimming - " + maxSwimDistance + " м");
        }
    }
}
