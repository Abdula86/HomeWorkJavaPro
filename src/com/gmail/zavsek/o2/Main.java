package com.gmail.zavsek.o2;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Human("Alice"), new Cat("Tom"), new Robot("R2D2")};

        Obstacle[] obstacles = {new Track(800), new Wall(1.5), new Track(1200), new Wall(2.5)};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    System.out.println(participant.getClass().getSimpleName() + " " + participant + " is eliminated!");
                    break;
                }
            }
        }
    }
}
