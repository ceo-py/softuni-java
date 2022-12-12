package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numberOfFlower = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double priceForRoses = 5 * numberOfFlower;
        double priceForDahlia = 3.80 * numberOfFlower;
        double priceForTulip = 2.80 * numberOfFlower;
        double priceForNarcissus = 3 * numberOfFlower;
        double priceForGladiolus = 2.50 * numberOfFlower;

        double sum = 0.0;

        if (flower.equals("Roses")) {
            if (numberOfFlower > 80) {
                sum = priceForRoses - (priceForRoses * 0.1);
            } else if (numberOfFlower <= 80) {
                sum = priceForRoses;
            }
        } else if (flower.equals("Dahlias")) {
            if (numberOfFlower > 90) {
                sum = priceForDahlia - (priceForDahlia * 0.15);
            } else if (numberOfFlower <= 90) {
                sum = priceForDahlia;
            }
        } else if (flower.equals("Tulips")) {
            if (numberOfFlower > 80) {
                sum = priceForTulip - (priceForTulip * 0.15);
            } else if (numberOfFlower <= 80) {
                sum = priceForTulip;
            }
        } else if (flower.equals("Narcissus")) {
            if (numberOfFlower < 120) {
                sum = priceForNarcissus + (priceForNarcissus * 0.15);
            } else if (numberOfFlower >= 120) {
                sum = priceForNarcissus;
            }
        } else if (flower.equals("Gladiolus")) {
            if (numberOfFlower < 80) {
                sum = priceForGladiolus + (priceForGladiolus * 0.20);
            } else if (numberOfFlower >= 80) {
                sum = priceForGladiolus;
            }
        }
        if (budget >= sum) {
            double price = budget - sum;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlower, flower, price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);
        }
    }
}