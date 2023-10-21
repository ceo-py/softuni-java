package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyForExcursion = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        //double spendMoney = 0.0;
        int counterSpendMoney = 0;
        int counterDays = 1;

        while (currentMoney<moneyForExcursion) {
            String input = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            if (input.equals("spend")) {
                currentMoney = currentMoney - money;
                if (currentMoney <= 0) {
                    currentMoney = 0;
                }
                counterSpendMoney++;
                if (counterSpendMoney == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(counterDays);
                    break;
                }
            } else if (input.equals("save")) {
                currentMoney += money;
                counterSpendMoney = 0;
                if (currentMoney >= moneyForExcursion) {
                    System.out.printf("You saved the money for %d days.", counterDays);
                    break;
                }
            }
            counterDays++;
        }
    }
}


// import java.util.Scanner;
//
// public class Vacation {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         double vacationPrice = Double.parseDouble(scanner.nextLine());
//         double money = Double.parseDouble(scanner.nextLine());
//
//         int totalDays = 0;
//         int consecutiveSpends = 0;
//
//         while (money < vacationPrice) {
//
//             String action = scanner.nextLine();
//             double sum = Double.parseDouble(scanner.nextLine());
//
//             totalDays++;
//
//             switch (action) {
//                 case "spend":
//                     money -= sum;
//                     if (money < 0) {
//                         money = 0.00;
//                     }
//                     consecutiveSpends++;
//                     break;
//                 case "save":
//                     money += sum;
//                     consecutiveSpends = 0;
//                     break;
//             }
//
//             if (consecutiveSpends == 5) {
//                 System.out.println("You can't save the money.");
//                 System.out.printf("%d", totalDays);
//                 return;
//             }
//         }
//
//         System.out.printf("You saved the money for %d days.", totalDays);
//     }
// }