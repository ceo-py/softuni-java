import java.util.Locale;
import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine().toLowerCase();
        double fuelAmount = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine().toLowerCase();

        double fuelPrice = 0;
        if (clubCard.equals("yes")) {
            if (fuel.equals("gas")) {
                fuelPrice = fuelAmount * 0.85;
            } else if (fuel.equals("gasoline")) {
                fuelPrice = fuelAmount * 2.04;
            } else if (fuel.equals("diesel")) {
                fuelPrice = fuelAmount * 2.21;
            }
        } else {
            if (fuel.equals("gas")) {
                fuelPrice = fuelAmount * 0.93;
            } else if (fuel.equals("gasoline")) {
                fuelPrice = fuelAmount * 2.22;
            } else if (fuel.equals("diesel")) {
                fuelPrice = fuelAmount * 2.33;
            }
        }
        if (fuelAmount < 20) {
            fuelPrice *= 1;
        } else if (fuelAmount <= 25) {
            fuelPrice *= 0.92;
        } else if (fuelAmount > 25) {
            fuelPrice *= 0.9;
        }
        System.out.printf("%.2f lv.", fuelPrice);
    }
}