import java.util.Scanner;

public class EasterLunch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bread = Integer.parseInt(scanner.nextLine());
        int eggCarton = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());

        double totalCost = bread * 3.2 + eggCarton * 4.35 + cookiesKg * 5.4 + eggCarton * 12 * 0.15;

        System.out.printf("%.2f", totalCost);
    }
}
