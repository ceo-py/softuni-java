import java.util.Scanner;

public class EasterParty02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double cateringPricePerguest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double cost = guests * cateringPricePerguest;
        double cakePrice = budget * 0.1;

        if (guests >= 10 && guests <= 15) {
            cost *= 0.85;
        } else if (guests >15 && guests <= 20) {
            cost *= 0.8;
        } else if (guests > 20) {
            cost *= 0.75;
        }

        double totalCost = cost + cakePrice;

        if (totalCost <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - totalCost);
        } else {
            System.out.printf("No party! %.2f leva needed.", totalCost - budget);
        }


    }
}
