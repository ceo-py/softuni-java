package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        while(true){
            String pass = scanner.nextLine();
            if(password.equals(pass)){
                System.out.println("Welcome " + username + "!");
                break;
            }
        }
    }
}