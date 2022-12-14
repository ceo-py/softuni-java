import java.util.Scanner;

public class CarToGo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classType = "";
        String carType = "";
        double totalCost = 0;

        if (budget <= 100) {
            classType = "Economy class";

            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    totalCost = budget * 0.35;
                    break;
                case "Winter":
                    carType = "Jeep";
                    totalCost = budget * 0.65;
                    break;

            }
        } else if (budget <= 500) {
            classType = "Compact class";

            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    totalCost = budget * 0.45;
                    break;
                case "Winter":
                    carType = "Jeep";
                    totalCost = budget * 0.8;
                    break;
            }
        } else {
            classType = "Luxury class";

            switch (season) {
                case "Summer":
                case "Winter":
                    carType = "Jeep";
                    totalCost = budget * 0.9;
                    break;
            }
        }
        System.out.println(classType);
        System.out.printf("%s - %.2f", carType, totalCost);
    }
}
