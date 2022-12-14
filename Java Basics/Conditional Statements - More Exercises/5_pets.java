import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double kgFood = Double.parseDouble(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDay = Double.parseDouble(scanner.nextLine());

        double totalFoodPerDay = (days * dogFoodPerDay) + (days * catFoodPerDay) + ((days * turtleFoodPerDay)/1000);

        if (totalFoodPerDay <= kgFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(kgFood - totalFoodPerDay));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodPerDay - kgFood));
        }

    }
}
