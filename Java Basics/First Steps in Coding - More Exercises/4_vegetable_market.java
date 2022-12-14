import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegPricePerKg = Double.parseDouble(scanner.nextLine());
        double fruitPricePerKg = Double.parseDouble(scanner.nextLine());
        int vegKg = Integer.parseInt(scanner.nextLine());
        int fruitKg = Integer.parseInt(scanner.nextLine());

        double totalPriceLv = vegPricePerKg * vegKg + fruitPricePerKg * fruitKg;
        double totalPriceEuro = totalPriceLv / 1.94;
        System.out.printf("%.2f", totalPriceEuro);
    }
}
