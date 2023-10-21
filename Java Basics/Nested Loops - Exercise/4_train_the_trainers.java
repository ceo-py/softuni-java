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


// import java.util.Scanner;
//
// public class TrainTheTrainers {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         // Брой оценяващи
//         int n = Integer.parseInt(scanner.nextLine());
//
//         int totalGradeCount = 0;
//         double totalGradeSum = 0.00;
//
//         String presentationName = scanner.nextLine();
//         while (!presentationName.equals("Finish")) {
//
//             double currentPresentationGrades = 0.00;
//
//             for (int i = 0; i < n; i++) {
//                 double currentJudgeGrade = Double.parseDouble(scanner.nextLine());
//                 currentPresentationGrades += currentJudgeGrade;
//                 totalGradeSum += currentJudgeGrade;
//                 totalGradeCount++;
//             }
//
//             double averagePresentationGrade = currentPresentationGrades / n;
//             System.out.printf("%s - %.2f.\n", presentationName, averagePresentationGrade);
//
//             presentationName = scanner.nextLine();
//         }
//
//         double averageGrade = totalGradeSum / totalGradeCount;
//         System.out.printf("Student's final assessment is %.2f.", averageGrade);
//     }
// }