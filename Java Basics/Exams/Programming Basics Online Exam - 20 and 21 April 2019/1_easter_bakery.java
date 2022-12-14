import java.util.Scanner;

public class EasterBakery01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggCartons = Integer.parseInt(scanner.nextLine());
        int yeastPackets = Integer.parseInt(scanner.nextLine());

        double sugarPrice = flourPrice * 0.75;

        double totalCost = flourKg * flourPrice + sugarPrice * sugarKg + flourPrice * 1.1 * eggCartons + sugarPrice * 0.2 * yeastPackets;

        System.out.printf("%.2f", totalCost);
    }
}
