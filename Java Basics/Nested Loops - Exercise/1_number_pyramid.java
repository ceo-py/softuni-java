package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isEqual = false;
        for (int rows = 1; rows <= number; rows++) {//
            for (int cols = 1; cols <= rows; cols++) {//
                counter++;
                if (counter > number) {
                    isEqual = true;
                    break;
                }
                System.out.printf(counter + " ");
            }
            System.out.println();
            if (isEqual) {
                break;
            }
        }

    }
}



// import java.util.Scanner;
//
// public class NumberPyramid {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         int n = Integer.parseInt(scanner.nextLine());
//
//         int count = 1;
//
//         for (int row = 1; row <= n; row++) {
//
//             for (int col = 1; col <= row; col++) {
//
//                 System.out.print(count + " ");
//                 if (count == n) {
//                     return;
//                 }
//
//                 count++;
//             }
//
//             System.out.println();
//         }
//
//     }
// }