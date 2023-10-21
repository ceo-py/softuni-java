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



// import java.util.Scanner;
//
// public class SummerOutfit {
//
//     public static void main(String[] args) {
//
//         //  Morning
//         //  10 <= градуси <= 18      Outfit = Sweatshirt   Shoes = Sneakers
//         //  18 < градуси <= 24       Outfit = Shirt        Shoes = Moccasins
//         //  градуси >= 25            Outfit = T-Shirt      Shoes = Sandals
//
//         //  Afternoon
//         //  10 <= градуси <= 18      Outfit = Shirt        Shoes = Moccasins
//         //  18 < градуси <= 24       Outfit = T-Shirt      Shoes = Sandals
//         //  градуси >= 25            Outfit = Swim Suit    Shoes = Barefoot
//
//         //  Evening
//         //  10 <= градуси <= 18      Outfit = Shirt        Shoes = Moccasins
//         //  18 < градуси <= 24       Outfit = Shirt        Shoes = Moccasins
//         //  градуси >= 25            Outfit = Shirt        Shoes = Moccasins
//         Scanner scanner = new Scanner(System.in);
//
//         int degrees = Integer.parseInt(scanner.nextLine());
//         String partOfDay = scanner.nextLine();
//
//         String outfit = "";
//         String shoes = "";
//
//         switch (partOfDay) {
//             case "Morning":
//                 if (degrees >= 10 && degrees <= 18) {
//                     outfit = "Sweatshirt";
//                     shoes = "Sneakers";
//                 } else if (degrees > 18 && degrees <= 24) {
//                     outfit = "Shirt";
//                     shoes = "Moccasins";
//                 } else {
//                     outfit = "T-Shirt";
//                     shoes = "Sandals";
//                 }
//                 break;
//             case "Afternoon":
//                 if (degrees >= 10 && degrees <= 18) {
//                     outfit = "Shirt";
//                     shoes = "Moccasins";
//                 } else if (degrees > 18 && degrees <= 24) {
//                     outfit = "T-Shirt";
//                     shoes = "Sandals";
//                 } else {
//                     outfit = "Swim Suit";
//                     shoes = "Barefoot";
//                 }
//                 break;
//             case "Evening":
//                 outfit = "Shirt";
//                 shoes = "Moccasins";
//                 break;
//         }
//
//         System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
//
//     }
// }