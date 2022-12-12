package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());
        int inputSum = 0;
        while (inputSum < sum) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            inputSum += currentNumber;
        }
        System.out.println(inputSum);
    }
}