import java.util.Scanner;

public class Vacation05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String accommodation = "";
        String location = "";
        double totalCost = 0;

        if (budget <= 1000) {
            accommodation = "Camp";

            switch (season) {
                case "Summer":
                    location = "Alaska";
                    totalCost = budget * 0.65;
                    break;
                case "Winter":
                    location = "Morocco";
                    totalCost = budget * 0.45;
                    break;

            }
        } else if (budget <= 3000) {
            accommodation = "Hut";

            switch (season) {
                case "Summer":
                    location = "Alaska";
                    totalCost = budget * 0.8;
                    break;
                case "Winter":
                    location = "Morocco";
                    totalCost = budget * 0.6;
                    break;
            }
        } else {
            accommodation = "Hotel";
            totalCost = budget * 0.9;
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    break;
                case "Winter":
                    location = "Morocco";
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f", location, accommodation, totalCost);
    }
}
