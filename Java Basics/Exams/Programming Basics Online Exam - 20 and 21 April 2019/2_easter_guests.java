import java.util.Scanner;

public class EasterGuests02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double breadPerGuest = Math.ceil(guests / 3.0);
        int eggsPerGuest = guests * 2;

        double totalCost = breadPerGuest * 4 + eggsPerGuest * 0.45;

        if (totalCost <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", breadPerGuest, eggsPerGuest);
            System.out.printf("He has %.2f lv. left.", budget - totalCost);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalCost - budget);
        }
    }
}
