package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double counter = Double.parseDouble(scanner.nextLine());

        double sum = 0.0;
        switch (product) {
            case "coffee":
                switch (city) {
                    case "Sofia":
                        sum = counter * 0.50;
                        break;
                    case "Plovdiv":
                        sum = counter * 0.40;
                        break;
                    case "Varna":
                        sum = counter * 0.45;
                        break;
                }
                break;
            case "water":
                switch (city) {
                    case "Sofia":
                        sum = counter * 0.80;
                        break;
                    case "Plovdiv":
                    case "Varna":
                        sum = counter * 0.70;
                        break;
                }
                break;
            case "beer":
                switch (city) {
                    case "Sofia":
                        sum = counter * 1.20;
                        break;
                    case "Plovdiv":
                        sum = counter * 1.15;
                        break;
                    case "Varna":
                        sum = counter * 1.10;
                        break;
                }
                break;
            case "sweets":
                switch (city) {
                    case "Sofia":
                        sum = counter * 1.45;
                        break;
                    case "Plovdiv":
                        sum = counter * 1.30;
                        break;
                    case "Varna":
                        sum = counter * 1.35;
                        break;
                }
                break;
            case "peanuts":
                switch (city) {
                    case "Sofia":
                        sum = counter * 1.60;
                        break;
                    case "Plovdiv":
                        sum = counter * 1.50;
                        break;
                    case "Varna":
                        sum = counter * 1.55;
                        break;
                }
                break;
        }
        System.out.println(sum);
    }
}