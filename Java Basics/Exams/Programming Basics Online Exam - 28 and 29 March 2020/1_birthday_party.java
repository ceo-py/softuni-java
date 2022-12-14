import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float rentHall = in.nextFloat();

        float cakePrice = rentHall * 0.20f;
        float drinkPrice = cakePrice * 0.55f;
        float animatorPrice = rentHall / 3;

        float neededBudget = cakePrice + drinkPrice + animatorPrice;

        System.out.printf("%.1f", neededBudget + rentHall);
    }
}
