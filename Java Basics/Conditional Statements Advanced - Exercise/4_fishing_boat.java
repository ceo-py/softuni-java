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



// import java.util.Scanner;
//
// public class FishingBoat {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         // 1. Input
//         int budget = Integer.parseInt(scanner.nextLine());
//         String season = scanner.nextLine();
//         int fishermen = Integer.parseInt(scanner.nextLine());
//
//         double shipPrice = 0.00;
//
//         // 2. Calculating the ship rent
//         switch (season) {
//             case "Spring":
//                 shipPrice = 3000;
//                 break;
//             case "Summer":
//             case "Autumn":
//                 shipPrice = 4200;
//                 break;
//             case "Winter":
//                 shipPrice = 2600;
//                 break;
//         }
//
//         if (fishermen <= 6) {
//             shipPrice = shipPrice - (shipPrice * 0.10);
//         } else if (fishermen <= 11) {
//             shipPrice = shipPrice - (shipPrice * 0.15);
//         } else {
//             shipPrice = shipPrice - (shipPrice * 0.25);
//         }
//
//         if (fishermen % 2 == 0 && !season.equals("Autumn")) {
//             shipPrice = shipPrice - (shipPrice * 0.05);
//         }
//
//         // 3. Print
//         if (budget >= shipPrice) {
//             System.out.printf("Yes! You have %.2f leva left.", budget - shipPrice);
//         } else {
//             System.out.printf("Not enough money! You need %.2f leva.", shipPrice - budget);
//         }
//     }
// }