package com.teachmeskills.lesson_13.task3;

import java.util.Scanner;

public class Main {

        private static FunctionalInterfaceExample<String> stringExample =
                text -> new StringBuilder(text).reverse().toString();

        private static FunctionalInterfaceExample<Integer> integerExample =
                value -> value <= 0 ? 1 : value * Main.integerExample.doJob(value - 1);

        public static void test() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Work with String.");
            System.out.println("2. Work with Integer.");
            System.out.print("Enter -> ");
            int choice = scanner.nextInt();
            switch (choice) {
                case (1):
                    System.out.print("Enter string: ");
                    String string = scanner.next();
                    System.out.println("Reversed string: " + stringExample.doJob(string));
                    break;
                case (2):
                    System.out.print("Enter positive integer: ");
                    Integer integer = scanner.nextInt();
                    System.out.println("Factorial of " + integer + " = " + integerExample.doJob(integer));
                default:
                    break;
            }
        }
}