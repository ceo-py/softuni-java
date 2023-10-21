package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = " ";
        String local = " ";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                budget = budget - (budget * 0.7);
                local = "Camp";
            } else if (season.equals("winter")) {
                budget = budget - (budget * 0.3);
                local = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                budget = budget - (budget * 0.6);
                local = "Camp";
            } else if (season.equals("winter")) {
                budget = budget - (budget * 0.2);
                local = "Hotel";
            }
        } else {
            destination = "Europe";
            budget = budget - (budget * 0.1);
            local = "Hotel";
        }
        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f", local, budget);


    }
}


// import java.util.Scanner;
//
// public class Journey {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         // 1. Input
//         double budget = Double.parseDouble(scanner.nextLine());
//         String season = scanner.nextLine();
//
//         String destination = "";
//         String place = "";
//         double spentMoney = 0.00;
//
//         // 2. Calculating the fee
//         if (budget <= 100) {
//             destination = "Bulgaria";
//             switch (season) {
//                 case "summer":
//                     place = "Camp";
//                     spentMoney = budget * 0.30;
//                     break;
//                 case "winter":
//                     place = "Hotel";
//                     spentMoney = budget * 0.70;
//                     break;
//             }
//         } else if (budget <= 1000) {
//             destination = "Balkans";
//             switch (season) {
//                 case "summer":
//                     place = "Camp";
//                     spentMoney = budget * 0.40;
//                     break;
//                 case "winter":
//                     place = "Hotel";
//                     spentMoney = budget * 0.80;
//                     break;
//             }
//         } else {
//             destination = "Europe";
//             place = "Hotel";
//             spentMoney = budget * 0.90;
//         }
//
//         System.out.printf("Somewhere in %s%n", destination);
//         System.out.printf("%s - %.2f", place, spentMoney);
//     }
// }