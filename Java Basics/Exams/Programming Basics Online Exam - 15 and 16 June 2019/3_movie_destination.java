import java.util.Scanner;

public class MovieDestination03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double cost = 0;

        switch (destination) {
            case "Dubai":
                switch (season) {
                    case "Winter":
                        cost = days * 45000 * 0.7;
                        break;
                    case "Summer":
                        cost = days * 40000 * 0.7;
                        break;
                }
                break;
            case "Sofia":
                switch (season) {
                    case "Winter":
                        cost = days * 17000 * 1.25;
                        break;
                    case "Summer":
                        cost = days * 12500 * 1.25;
                        break;
                }
                break;
            case "London":
                switch (season) {
                    case "Winter":
                        cost = days * 24000;
                        break;
                    case "Summer":
                        cost = days * 20250;
                        break;
                }
                break;
        }
        if (cost <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - cost);
        } else {
            System.out.printf("The director needs %.2f leva more!", cost - budget);
        }

    }
}
