package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());

        if (number >= -100 && number <= -1 || number >= 1 && number <= 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}