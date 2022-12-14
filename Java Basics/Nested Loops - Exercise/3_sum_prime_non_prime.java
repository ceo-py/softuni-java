package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sumOfPrimeNumbers = 0;
        int sumOfNonPrimeNumbers = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isPrime = true;

            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    sumOfNonPrimeNumbers = sumOfNonPrimeNumbers + number;
                    break;
                }
            }
            if (isPrime) {
                sumOfPrimeNumbers = sumOfPrimeNumbers + number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n"
                + "Sum of all non prime numbers is: %d", sumOfPrimeNumbers, sumOfNonPrimeNumbers);

    }
}