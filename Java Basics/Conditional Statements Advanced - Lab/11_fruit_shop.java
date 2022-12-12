package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double price = 0.0;
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            if (product.equals("banana")) {
                price = amount * 2.50;

            } else if (product.equals("apple")) {
                price = amount * 1.20;

            } else if (product.equals("orange")) {
                price = amount * 0.85;

            } else if (product.equals("grapefruit")) {
                price = amount * 1.45;

            } else if (product.equals("kiwi")) {
                price = amount * 2.70;

            } else if (product.equals("pineapple")) {
                price = amount * 5.50;

            } else if (product.equals("grapes")) {
                price = amount * 3.85;

            } else {
                System.out.println("error");
            }
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            if (product.equals("banana")) {
                price = amount * 2.70;

            } else if (product.equals("apple")) {
                price = amount * 1.25;

            } else if (product.equals("orange")) {
                price = amount * 0.90;

            } else if (product.equals("grapefruit")) {
                price = amount * 1.60;

            } else if (product.equals("kiwi")) {
                price = amount * 3.00;

            } else if (product.equals("pineapple")) {
                price = amount * 5.60;

            } else if (product.equals("grapes")) {
                price = amount * 4.20;
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
        if (price > 0) {
            System.out.printf("%.2f", price);
        }
    }
}