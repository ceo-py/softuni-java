package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= numbers; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
        }
        System.out.println(sum);
    }
}