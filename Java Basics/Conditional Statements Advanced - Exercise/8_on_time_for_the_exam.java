package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minutesOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArriving = Integer.parseInt(scanner.nextLine());
        int minutesOfArriving = Integer.parseInt(scanner.nextLine());

        int examTime = hourOfExam * 60 + minutesOfExam;
        int arrivingTime = hourOfArriving * 60 + minutesOfArriving;
        String outputText = " ";
        String outputTime = " ";
        int differenceTime = 0;

        if (arrivingTime < examTime - 30) {
            outputText = "Early";
            differenceTime = examTime - arrivingTime;

            if (differenceTime < 60) {
                outputTime = String.format("%d minutes before the start ", differenceTime);
            } else {
                int hours = differenceTime / 60;
                int minutes = differenceTime % 60;
                outputTime = String.format("%d:%02d hours before the start ", hours, minutes);
            }
        } else if (arrivingTime <= examTime) {
            differenceTime = examTime - arrivingTime;
            outputText = "On time";
            outputTime = String.format("%d minutes before the start ", differenceTime);

        } else if (arrivingTime > examTime) {
            differenceTime = arrivingTime - examTime;
            outputText = "Late";
            if (differenceTime < 60) {
                outputTime = String.format("%d minutes after the start ", differenceTime);
            } else {
                int hours = differenceTime / 60;
                int minutes = differenceTime % 60;
                outputTime = String.format("%d:%02d hours after the start ", hours, minutes);
            }
        }
        System.out.println(outputText);
        System.out.println(outputTime);
    }
}




// import java.util.Scanner;
//
// public class OnTimeForTheExam {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         int examHour = Integer.parseInt(scanner.nextLine());
//         int examMinutes = Integer.parseInt(scanner.nextLine());
//         int arrivalHour = Integer.parseInt(scanner.nextLine());
//         int arrivalMinutes = Integer.parseInt(scanner.nextLine());
//
//         int examTime = (examHour * 60) + examMinutes;
//         int arrivalTime = (arrivalHour * 60) + arrivalMinutes;
//
//         int diff = Math.abs(examTime - arrivalTime);
//
//         //exam 9:30 -> (9 * 60) + 30 = 570
//         //arrival 9:50 -> (9 * 60) + 50 = 590
//         if (examTime < arrivalTime) {
//             System.out.println("Late");
//             if (diff >= 60) {
//                 int hours = diff / 60;
//                 int min = diff % 60;
//                 System.out.printf("%d:%02d hours after the start", hours, min);
//             } else {
//                 System.out.printf("%d minutes after the start", diff);
//             }
//         } else if (examTime == arrivalTime || diff <= 30) {
//             System.out.println("On Time");
//             if (diff >= 1) {
//                 System.out.printf("%d minutes before the start", diff);
//             }
//         } else {
//             System.out.println("Early");
//             if (diff >= 60) {
//                 int hours = diff / 60;
//                 int min = diff % 60;
//                 System.out.printf("%d:%02d hours before the start", hours, min);
//             } else {
//                 System.out.printf("%d minutes before the start", diff);
//             }
//         }
//     }
// }