package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= numberOfInput; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        int sumWithoutMaxNum = sum - maxNumber;
        if (maxNumber == sumWithoutMaxNum) {
            System.out.println("Yes");
            System.out.println("Sum = " + maxNumber);
        } else {
            int difference = Math.abs(maxNumber - sumWithoutMaxNum);
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }
    }
}



// import java.util.Scanner;
//
// public class _02_HalfSumElement {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         int n = Integer.parseInt(scanner.nextLine());
//
//         int maxNumber = Integer.MIN_VALUE;
//         int sum = 0;
//
//         // Начало: 1
//         // Край: n
//         // Стъпка: +1 (i++)
//         for (int i = 1; i <= n; i++) {
//
//             int currentNumber = Integer.parseInt(scanner.nextLine());
//             sum += currentNumber;
//
//             if (maxNumber < currentNumber) {
//                 maxNumber = currentNumber;
//             }
//         }
//
//         int sumOther = sum - maxNumber;
//
//         if (maxNumber == sumOther) {
//             System.out.println("Yes");
//             System.out.printf("Sum = %d", maxNumber);
//         } else {
//             System.out.println("No");
//             System.out.printf("Diff = %d", Math.abs(maxNumber - sumOther));
//         }
//     }
// }