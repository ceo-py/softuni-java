import java.util.Scanner;

public class WorldSnookerChampionship03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeMatch = scanner.nextLine();
        String typeTicket = scanner.nextLine();
        int numberTickets = Integer.parseInt(scanner.nextLine());
        String wantPicture = scanner.nextLine();

        double totalCost = 0;

        switch (typeMatch) {
            case "Quarter final":
                switch (typeTicket) {
                    case "Standard":
                        totalCost = numberTickets * 55.5;
                        break;
                    case "Premium":
                        totalCost = numberTickets * 105.2;
                        break;
                    case "VIP":
                        totalCost = numberTickets * 118.9;
                        break;
                }
                break;
            case "Semi final":
                switch (typeTicket) {
                    case "Standard":
                        totalCost = numberTickets * 75.88;
                        break;
                    case "Premium":
                        totalCost = numberTickets * 125.22;
                        break;
                    case "VIP":
                        totalCost = numberTickets * 300.4;
                        break;
                }
                break;
            case "Final":
                switch (typeTicket) {
                    case "Standard":
                        totalCost = numberTickets * 110.1;
                        break;
                    case "Premium":
                        totalCost = numberTickets * 160.66;
                        break;
                    case "VIP":
                        totalCost = numberTickets * 400;
                        break;
                }
                break;
        }
        if (totalCost > 4000) {
            totalCost *= 0.75;
        } else if (totalCost > 2500) {
            totalCost *= 90
        }
        if (wantPicture.equals(Y) && (totalCost <= 4000)){
            totalCost += 40 * numberTickets
        }

        System.out.printf("%.2f", totalCost);
    }
}
