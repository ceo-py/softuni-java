package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddSum = 0;
        int evenSum = 0;
        int numbers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numbers; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else {
            int difference = Math.abs(evenSum - oddSum);
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }
    }
}