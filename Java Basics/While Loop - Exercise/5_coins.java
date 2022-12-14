import java.util.Scanner;

public class Coins05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine()) * 100;

        int coins = 0;

        while (sum > 0){
            while (sum >= 200) {
                coins++;
                sum -= 200;
            }
            while (sum >= 100) {
                coins++;
                sum -= 100;
            }
            while (sum >= 50) {
                coins++;
                sum -= 50;
            }
            while (sum >= 20) {
                coins++;
                sum -= 20;
            }
            while (sum >= 10) {
                coins++;
                sum -= 10;
            }
            while (sum >= 5) {
                coins++;
                sum -= 5;
            }
            while (sum >= 2) {
                coins++;
                sum -= 2;
            }
            while (sum >= 1) {
                coins++;
                sum -= 1;
            }
            break;
        }
        System.out.println(coins);
    }
}

//        while (sum > 0) {
//            while (sum >= 2 || sum > 1.99) {
//                coins++;
//                sum -= 2;
//            }
//            while (sum >= 1 || sum > 0.99) {
//                coins++;
//                sum--;
//            }
//            while (sum >= 0.5 || sum > 0.49) {
//                coins++;
//                sum -= 0.50;
//            }
//            while (sum >= 0.2 || sum > 0.19) {
//                coins++;
//                sum -= 0.20;
//            }
//            while (sum >= 0.1 || sum > 0.09) {
//                coins++;
//                sum -= 0.10;
//            }
//            while (sum >= 0.05 || sum > 0.04) {
//                coins++;
//                sum -= 0.05;
//            }
//            while (sum >= 0.02 || sum > 0.01) {
//                coins++;
//                sum -= 0.02;
//            }
//            while (sum >= 0.01) {
//                coins++;
//                sum -= 0.01;
//            }
//            while (sum < 0.01 && sum > 0) {
//                break;
//            }
//            break;
//        }
//        System.out.println(coins);