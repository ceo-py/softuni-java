import java.util.Scanner;

public class VetParking06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());

        double totalCost = 0;
        double cost = 0;

        for (int i = 1; i <= days ; i++) {
            for (int j = 1; j <= hoursPerDay ; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    cost += 2.5;
                } else if (i % 2 != 0 && j % 2 ==0) {
                    cost += 1.25;
                } else {
                    cost += 1;
                }
            }
            totalCost += cost;
            System.out.printf("Day: %d - %.2f leva%n", i, cost);
            cost = 0;
        }
        System.out.printf("Total: %.2f leva%n", totalCost);
    }
}
