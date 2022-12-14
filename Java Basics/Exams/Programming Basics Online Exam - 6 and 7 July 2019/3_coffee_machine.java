import java.util.Scanner;

public class CoffeeMachine03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drinkType = scanner.nextLine();
        String sugarAmount = scanner.nextLine();
        int numberDrinks = Integer.parseInt(scanner.nextLine());

        double totalCost = 0;

        switch (drinkType) {
            case "Espresso":
                switch (sugarAmount) {
                    case "Without":
                        totalCost = numberDrinks * 0.9 * 0.65;
                        break;
                    case "Normal":
                        totalCost = numberDrinks * 1.0;
                        break;
                    case "Extra":
                        totalCost = numberDrinks * 1.2;
                        break;
                } break;
            case "Cappuccino":
                switch (sugarAmount) {
                    case "Without":
                        totalCost = numberDrinks * 1.0 * 0.65;
                        break;
                    case "Normal":
                        totalCost = numberDrinks * 1.2;
                        break;
                    case "Extra":
                        totalCost = numberDrinks * 1.6;
                        break;
                } break;
            case "Tea":
                switch (sugarAmount) {
                    case "Without":
                        totalCost = numberDrinks * 0.5 * 0.65;
                        break;
                    case "Normal":
                        totalCost = numberDrinks * 0.6;
                        break;
                    case "Extra":
                        totalCost = numberDrinks * 0.7;
                        break;
                } break;
        }
        if (drinkType.equals("Espresso") && numberDrinks >= 5) {
            totalCost *= 0.75;
        }

        if (totalCost > 15) {
            totalCost *= 0.8;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", numberDrinks, drinkType, totalCost);
    }
}
