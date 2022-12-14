package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfJury = Integer.parseInt(scanner.nextLine());
        int counterGrades = 0;
        double grades = 0;

        while (true) {
            String nameOfPresentation = scanner.nextLine();
            double sumGrade = 0;

            if (nameOfPresentation.equals("Finish")) {
                double totalAverage = grades / counterGrades;
                System.out.printf("Student's final assessment is %.2f.", totalAverage);
                break;
            }
            for (int i = 0; i < numberOfJury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrade += grade;
                grades += grade;
                counterGrades++;
            }
            double averageGrade = sumGrade / numberOfJury;
            System.out.printf("%s - %.2f.%n", nameOfPresentation, averageGrade);
        }
    }
}