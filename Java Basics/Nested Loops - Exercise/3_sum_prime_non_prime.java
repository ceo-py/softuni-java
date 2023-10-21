package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sumOfPrimeNumbers = 0;
        int sumOfNonPrimeNumbers = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isPrime = true;

            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    sumOfNonPrimeNumbers = sumOfNonPrimeNumbers + number;
                    break;
                }
            }
            if (isPrime) {
                sumOfPrimeNumbers = sumOfPrimeNumbers + number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n"
                + "Sum of all non prime numbers is: %d", sumOfPrimeNumbers, sumOfNonPrimeNumbers);

    }
}




// import java.util.Scanner;
//
// public class SumPrimeNonPrime {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         // --- 1. Дефинираме две променливи за сумите
//         // --- 2. Пускаме while цикъл до получаване на команда "stop"
//         // --- 3. Проверка дали числото е орицателно и ако е, принтираме на конзолата "Number is negative."
//         // --- 4. Проверка дали числото е просто или не е
//         // --- 5. Добавяме числото към сумата
//         // 6. Принтиране на двете суми
//
//         int primeSum = 0;
//         int nonPrimeSum = 0;
//
//         String input = scanner.nextLine();
//         while (!input.equals("stop")) {
//
//             int number = Integer.parseInt(input);
//
//             if (number < 0) {
//                 System.out.println("Number is negative.");
//             } else {
//
//                 boolean isPrime = true;
//
//                 for (int divisor = 2; divisor <= number - 1; divisor++) {
//                     if (number % divisor == 0) {
//                         isPrime = false;
//                         break;
//                     }
//                 }
//
//                 if (isPrime) {
//                     primeSum += number;
//                 } else {
//                     nonPrimeSum += number;
//                 }
//             }
//
//             input = scanner.nextLine();
//         }
//
//         System.out.printf("Sum of all prime numbers is: %d\n", primeSum);
//         System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
//     }
// }