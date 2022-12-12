package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double result = 0.0;

        switch (city) {
            case "Sofia":
                if (sales > 0 && sales <= 500) {
                    result = sales * 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    result = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    result = sales * 0.08;
                } else if (sales > 10000) {
                    result = sales * 0.12;
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sales > 0 && sales <= 500) {
                    result = sales * 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    result = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    result = sales * 0.10;
                } else if (sales > 10000) {
                    result = sales * 0.13;
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sales > 0 && sales <= 500) {
                    result = sales * 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    result = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    result = sales * 0.12;
                } else if (sales > 10000) {
                    result = sales * 0.145;
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
        if (result > 0) {
            System.out.printf("%.2f", result);
        }
    }
}