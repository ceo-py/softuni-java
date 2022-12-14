import java.util.Scanner;

public class BackToThePast01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());


        double cost = 0;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                cost = 12000;
                money -= cost;
            } else {
                cost = 12000 + ((i - 1782) * 50);
                money -= cost;
            }
        }

        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
