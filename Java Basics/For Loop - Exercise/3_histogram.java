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



// import java.util.Scanner;
//
// public class Histogram {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//
//         // 1. Reading input
//         int n = Integer.parseInt(scanner.nextLine());
//
//         // p1, p2, p3, p4 и p5
//         double p1 = 0.00;
//         double p2 = 0.00;
//         double p3 = 0.00;
//         double p4 = 0.00;
//         double p5 = 0.00;
//
//         // 2. Calculating percent
//         for (int i = 0; i < n; i++) {
//             int number = Integer.parseInt(scanner.nextLine());
//
//             if (number < 200) {
//                 p1++;
//             } else if (number <= 399) {
//                 p2++;
//             } else if (number <= 599) {
//                 p3++;
//             } else if (number <= 799) {
//                 p4++;
//             } else {
//                 p5++;
//             }
//         }
//
//         // 3. Printing output
//         System.out.printf("%.02f%%\n", p1 / n * 100);
//         System.out.printf("%.02f%%\n", p2 / n * 100);
//         System.out.printf("%.02f%%\n", p3 / n * 100);
//         System.out.printf("%.02f%%\n", p4 / n * 100);
//         System.out.printf("%.02f%%\n", p5 / n * 100);
//
//     }
// }