import java.util.Scanner;

public class FamilyTrip02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberNights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int otherExpenses = Integer.parseInt(scanner.nextLine());

        if (numberNights > 7) {
            pricePerNight *= 0.95;
        }

        double totalCost = numberNights * pricePerNight + (budget * otherExpenses) / 100;

        if (totalCost <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalCost);
        } else {
            System.out.printf("%.2f leva needed.", totalCost - budget);
        }
    }
}
