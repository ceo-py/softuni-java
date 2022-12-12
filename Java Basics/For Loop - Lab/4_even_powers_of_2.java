package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= number; i += 2) {
            double result = Math.pow(2, i);
            System.out.printf("%.0f%n", result);
        }
    }
}