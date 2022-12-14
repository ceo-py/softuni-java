import java.util.Scanner;

public class MatchTickets01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String categoryTicket = scanner.nextLine();
        int peopleInGroup = Integer.parseInt(scanner.nextLine());

        if (peopleInGroup <= 4) {
            budget *= 0.25;
        } else if (peopleInGroup <= 9) {
            budget *= 0.4;
        } else if (peopleInGroup <= 24) {
            budget *= 0.5;
        } else if (peopleInGroup <= 49) {
            budget *= 0.6;
        } else {
            budget *= 0.75;
        }

        double ticketCost = 0;

        switch (categoryTicket) {
            case "VIP":
                ticketCost = peopleInGroup * 499.99;
                break;
            case "Normal":
                ticketCost = peopleInGroup * 249.99;
                break;
        }

        if (budget >= ticketCost) {
            System.out.printf("Yes! You have %.2f leva left.", budget - ticketCost);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", ticketCost - budget);
        }
    }
}
