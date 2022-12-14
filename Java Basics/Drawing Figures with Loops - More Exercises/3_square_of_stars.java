package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                System.out.print("* ");
                if (col == number - 1) {
                    System.out.println();
                }
            }
        }
    }
}