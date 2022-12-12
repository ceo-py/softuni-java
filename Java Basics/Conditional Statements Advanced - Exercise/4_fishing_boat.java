package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfFishers = Integer.parseInt(scanner.nextLine());

        double rent = 0.0;

        switch (season) {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
            default:
                break;

        }
        if (numberOfFishers <= 6) {
            rent = rent - (rent * 0.10);
        } else if (numberOfFishers > 7 && numberOfFishers <= 11) {
            rent = rent - (rent * 0.15);
        } else if (numberOfFishers > 12) {
            rent = rent - (rent * 0.25);
        }

        if (numberOfFishers % 2 == 0) {
            if (season.equals("Spring") || season.equals("Summer") || season.equals("Winter")) {
                rent = rent - (rent * 0.05);
            }
        }

        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }

    }
}