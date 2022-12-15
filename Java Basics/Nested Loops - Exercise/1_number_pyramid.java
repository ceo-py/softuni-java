package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isEqual = false;
        for (int rows = 1; rows <= number; rows++) {//
            for (int cols = 1; cols <= rows; cols++) {//
                counter++;
                if (counter > number) {
                    isEqual = true;
                    break;
                }
                System.out.printf(counter + " ");
            }
            System.out.println();
            if (isEqual) {
                break;
            }
        }

    }
}