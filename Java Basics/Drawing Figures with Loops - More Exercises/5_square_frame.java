package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= number; row++) {

            if (row == 1 || row == number) {

                System.out.print("+ ");

                for (int col = 1; col <= number - 2; col++) {
                    System.out.print("- ");
                }
                System.out.println("+");
            } else {

                System.out.print("| ");

                for (int col = 1; col <= number - 2; col++) {
                    System.out.print("- ");
                }
                System.out.println("|");

            }

        }
    }
}