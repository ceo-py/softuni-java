import java.util.Scanner;

public class Safari02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litresFuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double totalCost = litresFuel * 2.1 + 100;

        switch (day) {
            case "Saturday":
                totalCost *= 0.9;
                break;
            case "Sunday":
                totalCost *= 0.8;
                break;
        }

        if (totalCost <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - totalCost);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", totalCost - budget);
        }
    }
}
