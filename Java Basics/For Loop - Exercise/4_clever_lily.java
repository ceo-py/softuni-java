package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceOfWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceForOneToy = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        int countBrother = 0;
        double sumMoney = 0.0;
        double money = 0.0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                countToys++;
            } else {
                countBrother++;
                money = money + 10;
                sumMoney += money;
            }
        }
        double toysMoney = countToys * priceForOneToy;
        double allMoney = toysMoney + sumMoney - countBrother;
        double difference = Math.abs(allMoney - priceOfWashingMachine);

        if (priceOfWashingMachine <= allMoney) {
            System.out.printf("Yes! %.2f", difference);
        } else {
            System.out.printf("No! %.2f", difference);
        }
    }
}