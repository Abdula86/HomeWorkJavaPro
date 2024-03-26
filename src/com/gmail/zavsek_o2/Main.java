package com.gmail.zavsek_o2;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        int num1 = 5;
        int num2 = 15;
        System.out.println(isSumInRange(num1, num2));

        int number = -7;
        printPositiveOrNegative(number);

        int num = -3;
        System.out.println(isNegative(num));

        printStringMultipleTimes("Hello, World!", 3);

        int year = 2024;
        System.out.println(isLeapYear(year));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("The amount is positive");
        } else {
            System.out.println("The amount is negative");
        }
    }

    public static void printColor() {
        int value = 75;

        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("A positive number");
        } else {
            System.out.println("A negative number");
        }
    }

    public static boolean isNegative(int num) {
        return num < 0;
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
