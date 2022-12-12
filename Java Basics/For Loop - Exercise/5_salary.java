package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabInBrowser = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean lost = false;

        for (int i = 1; i <= tabInBrowser; i++) {
            String nameOfWebsite = scanner.nextLine();
            if (nameOfWebsite.equals("Facebook")) {
                salary = salary - 150;
            } else if (nameOfWebsite.equals("Instagram")) {
                salary = salary - 100;
            } else if (nameOfWebsite.equals("Reddit")) {
                salary = salary - 50;
            }
            if (salary <= 0) {
                lost = true;
                break;
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}