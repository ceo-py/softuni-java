package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int leftSide = 0;
        int numbers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numbers; i++) {
            leftSide += Integer.parseInt(scanner.nextLine());
        }
        int rightSide = 0;
        for (int i = 1; i <= numbers; i++) {
            rightSide += Integer.parseInt(scanner.nextLine());
        }
        if (leftSide == rightSide) {
            System.out.println("Yes, sum = " + leftSide);
        } else {
            int difference = Math.abs(leftSide - rightSide);
            System.out.println("No, diff = " + difference);
        }
    }
}