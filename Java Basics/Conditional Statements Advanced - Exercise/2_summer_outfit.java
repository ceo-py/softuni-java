package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int celsius = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        String outfit = " ";
        String shoes = " ";

        switch (timeOfDay) {
            case "Morning":
                if (celsius >= 10 && celsius <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (celsius > 18 && celsius <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (celsius >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (celsius >= 10 && celsius <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (celsius > 18 && celsius <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (celsius >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (celsius >= 10 && celsius <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (celsius > 18 && celsius <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (celsius >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.println("It's " + celsius + " degrees, get your " + outfit + " and " + shoes + ".");
    }
}