package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ticketForPremiere = 12.00;
        double ticketForNormal = 7.50;
        double ticketForDiscount = 5.00;

        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double result = 0.0;

        if (typeProjection.equals("Premiere")) {
            result = rows * columns * ticketForPremiere;
        } else if (typeProjection.equals("Normal")) {
            result = rows * columns * ticketForNormal;
        } else if (typeProjection.equals("Discount")) {
            result = rows * columns * ticketForDiscount;
        }
        System.out.printf("%.2f", result);
    }
}



// import java.util.Scanner;
//
// public class Cinema {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         String typeOfProjection = scanner.nextLine();
//         int rows = Integer.parseInt(scanner.nextLine());
//         int cols = Integer.parseInt(scanner.nextLine());
//
//         int totalSeats = rows * cols;
//         double totalIncome = 0.00;
//
//         //Premiere - 12.00
//         //Normal - 7.50
//         //Discount - 5.00
//         switch (typeOfProjection) {
//             case "Premiere":
//                 totalIncome = totalSeats * 12.00;
//                 break;
//             case "Normal":
//                 totalIncome = totalSeats * 7.50;
//                 break;
//             case "Discount":
//                 totalIncome = totalSeats * 5.00;
//                 break;
//         }
//
//         System.out.printf("%.2f leva", totalIncome);
//
//     }
// }