package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate three random integers
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);

        // Prompt user to enter the sum of three integers
        System.out.print(
                "What is " + a + " + " + b + " + " + c + "? ");
        int answer = scanner.nextInt();

        System.out.println(
                a + " + " + b + " + " + c + " = " + answer + " is " +
                        (a + b + c == answer));
    }
}
