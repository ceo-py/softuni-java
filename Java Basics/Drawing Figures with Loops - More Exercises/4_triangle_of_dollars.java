package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < number; row++) {
            System.out.print("$");
            for (int col = 0; col < row; col++) {
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}