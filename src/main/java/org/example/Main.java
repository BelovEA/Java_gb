package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int currentNum = 0;
        int previousNum = 0;

        do {
            System.out.print("Enter an integer (0 to exit): ");
            if (scanner.hasNextInt()) {
                currentNum = scanner.nextInt();
                if (currentNum > 0 && previousNum < 0) {
                    sum += currentNum;
                }
                previousNum = currentNum;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        } while (currentNum != 0);

        scanner.close();

        System.out.println("Sum of positive integers following a negative integer: " + sum);
    }
}
