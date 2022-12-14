import java.util.Scanner;

public class BikeRace02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String routeType = scanner.nextLine();

        double totalMoneyRaised = 0;

        switch (routeType) {
            case "trail":
                totalMoneyRaised = (juniors * 5.50 + seniors * 7) * 0.95;
                break;
            case "cross-country":
                totalMoneyRaised = (juniors * 8 + seniors * 9.5);

                if (juniors + seniors >= 50) {
                    totalMoneyRaised *= 0.75;
                }
                totalMoneyRaised *= 0.95;
                break;
                case "downhill":
                totalMoneyRaised = (juniors * 12.25 + seniors * 13.75) * 0.95;
                break;
                case "road":
                totalMoneyRaised = (juniors * 20 + seniors * 21.5) * 0.95;
                break;
        }
        System.out.printf("%.2f", totalMoneyRaised);
    }
}
