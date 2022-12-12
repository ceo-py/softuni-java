package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double counter1 = 0.0;
        double counter2 = 0.0;
        double counter3 = 0.0;
        double counter4 = 0.0;
        double counter5 = 0.0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                counter1++;
            } else if (number >= 200 && number < 400) {
                counter2++;
            } else if (number >= 400 && number < 600) {
                counter3++;
            } else if (number >= 600 && number < 800) {
                counter4++;
            } else if (number >= 800) {
                counter5++;
            }
        }
        double p1 = counter1 / n * 100;
        double p2 = counter2 / n * 100;
        double p3 = counter3 / n * 100;
        double p4 = counter4 / n * 100;
        double p5 = counter5 / n * 100;

        System.out.printf("%.2f", p1);
        System.out.println("%");
        System.out.printf("%.2f", p2);
        System.out.println("%");
        System.out.printf("%.2f", p3);
        System.out.println("%");
        System.out.printf("%.2f", p4);
        System.out.println("%");
        System.out.printf("%.2f", p5);
        System.out.println("%");
    }
}