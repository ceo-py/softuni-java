package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondsFirst = Integer.parseInt(scanner.nextLine());
        int secondsSecond = Integer.parseInt(scanner.nextLine());
        int secondsThird = Integer.parseInt(scanner.nextLine());

        int totalSeconds = secondsFirst + secondsSecond + secondsThird;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        if(seconds<10){
            System.out.printf("%d:0%d",minutes,seconds);
        }else{
            System.out.printf("%d:%d",minutes,seconds);
        }
    }
}