package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double pricePerNightForStudio = 0.0;
        double pricePerNightForApartment = 0.0;

        if (month.equals("May") || month.equals("October")) {
            pricePerNightForStudio = 50 * numberOfNights;
            pricePerNightForApartment = 65 * numberOfNights;
            if (14 < numberOfNights) {
                pricePerNightForStudio = pricePerNightForStudio - (pricePerNightForStudio * 0.3);
            } else if (7 < numberOfNights) {
                pricePerNightForStudio = (pricePerNightForStudio * 0.5);
            }
        } else if (month.equals("June") || month.equals("September")) {
            pricePerNightForStudio = 75.20 * numberOfNights;
            pricePerNightForApartment = 68.70 * numberOfNights;
            if (numberOfNights > 14) {
                pricePerNightForStudio = pricePerNightForStudio - (pricePerNightForStudio * 0.2);
            }
        } else if (month.equals("July") || month.equals("August")) {
            pricePerNightForStudio = 76 * numberOfNights;
            pricePerNightForApartment = 77 * numberOfNights;
        }
        if (numberOfNights > 14) {
            pricePerNightForApartment = pricePerNightForApartment - (pricePerNightForApartment * 0.1);
        }
        System.out.printf("Apartment: %.2f lv.", pricePerNightForApartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", pricePerNightForStudio);
    }
}