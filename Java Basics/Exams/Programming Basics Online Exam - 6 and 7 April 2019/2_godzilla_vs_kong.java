import java.util.Scanner;

public class GodzillaVsKong02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothesCost = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;

        if (statist > 150) {
            clothesCost *= 0.9;
        }
        double totalCost = statist * clothesCost + decor;

        if (totalCost <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalCost);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalCost - budget);
        }
    }
}
