package com.gmail.zavsek_o2;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Bobik");
        Cat catMurka = new Cat("Murka");

        dogBobik.run(150);
        dogBobik.swim(5);

        catMurka.run(250);
        catMurka.swim(5);
    }
}
