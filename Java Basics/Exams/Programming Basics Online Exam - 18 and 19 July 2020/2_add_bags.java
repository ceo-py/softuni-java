import java.util.Scanner;

public class AddBags02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOver20Kg = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int daysTravel = Integer.parseInt(scanner.nextLine());
        int luggageNumber = Integer.parseInt(scanner.nextLine());

        double priceLuggage = 0;

        if (luggageKg >= 10 && luggageKg <= 20) {
            priceLuggage = luggageNumber * priceOver20Kg * 0.5;
        } else if (luggageKg < 10) {
            priceLuggage = luggageNumber * priceOver20Kg * 0.2;
        } else {
            priceLuggage = luggageNumber* priceOver20Kg;
        }

        if (daysTravel < 7) {
            priceLuggage *= 1.4;
        } else if (daysTravel >= 7 && daysTravel <= 30) {
            priceLuggage *= 1.15;
        } else {
            priceLuggage *= 1.1;
        }

        System.out.printf("The total price of bags is: %.2f lv. ", priceLuggage);
    }
}
