package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfStudent = scanner.nextLine();

        int counterYears = 1;
        double sumGrade = 0.0;
        int counterExcluded = 0;

        while (counterYears <= 12) {

            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4.00) {
                counterExcluded++;
            } else {
                counterYears++;
            }
            if (counterExcluded > 1) {
                break;
            }
            sumGrade = sumGrade + currentGrade;
        }
        if (counterExcluded > 1) {
            System.out.println(nameOfStudent + " has been excluded at " + counterYears + " grade");
        } else {
            double finalGrade = sumGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", nameOfStudent, finalGrade);
        }
    }
}