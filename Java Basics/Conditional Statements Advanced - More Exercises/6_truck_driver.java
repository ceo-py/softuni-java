import java.util.Scanner;

public class TruckDriver06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double income = 0;

        if (kmPerMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    income = 4 * (kmPerMonth * 0.75) * 0.9;
                    break;
                case "Summer":
                    income = 4 * (kmPerMonth * 0.9) * 0.9;
                    break;
                case "Winter":
                    income = 4 * (kmPerMonth * 1.05) * 0.9;
                    break;
            }
        } else if (kmPerMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    income = 4 * (kmPerMonth * 0.95) * 0.9;
                    break;
                case "Summer":
                    income = 4 * (kmPerMonth * 1.1) * 0.9;
                    break;
                case "Winter":
                    income = 4 * (kmPerMonth * 1.25) * 0.9;
                    break;
            }
        } else {
            switch (season) {
                case "Spring":
                case "Autumn":
                case "Summer":
                case "Winter":
                    income = 4 * (kmPerMonth * 1.45) * 0.9;
                    break;
            }
        }
        System.out.printf("%.2f", income);
    }
}
