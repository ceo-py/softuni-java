import java.util.Scanner;

public class TouristShop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();

        int productsPurchased = 0;
        double totalCost = 0;
        int counter = 0;

        while (!productName.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());
            counter++;
            if (counter % 3 == 0) {
                productPrice *= 0.5;
            }
            totalCost += productPrice;

            if (totalCost > budget) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", totalCost - budget);
                break;
            } else {
                productsPurchased++;
            }

            productName = scanner.nextLine();
        }
        if (productName.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", productsPurchased, totalCost);
        }
    }
}
