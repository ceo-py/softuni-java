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