package com.company;

public class Main {

    public static void main(String[] args) {

        for (int rows = 0; rows < 10; rows++) {
            for (int col = 0; col < 10; col++) {
                System.out.print("*");
                if (col == 9) {
                    System.out.println();
                }
            }
        }
    }
}