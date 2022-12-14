import java.util.Scanner;

public class Fitness_Card_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        int cardPrice = 0;

        switch (gender) {
            case 'm':
                if (sport.equals("Gym")) {
                    cardPrice = 42;
                }
                if (sport.equals("Boxing")) {
                    cardPrice = 41;
                }
                if (sport.equals("Yoga")) {
                    cardPrice = 45;
                }
                if (sport.equals("Zumba")) {
                    cardPrice = 34;
                }
                if (sport.equals("Dances")) {
                    cardPrice = 51;
                }
                if (sport.equals("Pilates")) {
                    cardPrice = 39;
                }
                break;
            case 'f':
                if (sport.equals("Gym")) {
                    cardPrice = 35;
                }
                if (sport.equals("Boxing")) {
                    cardPrice = 37;
                }
                if (sport.equals("Yoga")) {
                    cardPrice = 42;
                }
                if (sport.equals("Zumba")) {
                    cardPrice = 31;
                }
                if (sport.equals("Dances")) {
                    cardPrice = 53;
                }
                if (sport.equals("Pilates")) {
                    cardPrice = 37;
                }
                break;
        }
        double finalPrice = 0;

        if (age <= 19) {
            finalPrice = cardPrice - (cardPrice * 0.2);
        } else {
            finalPrice = cardPrice;
        }

        if (money >= finalPrice) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", finalPrice - money);
        }

    }
}