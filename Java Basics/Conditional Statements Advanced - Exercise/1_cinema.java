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