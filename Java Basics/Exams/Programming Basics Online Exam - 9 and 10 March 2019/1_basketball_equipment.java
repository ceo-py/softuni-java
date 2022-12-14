import java.util.Scanner;

public class BasketballEquipment01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int costPerYear = Integer.parseInt(scanner.nextLine());
        double priceTrainers = costPerYear * 0.6;
        double priceClothes = priceTrainers * 0.8;
        double priceBall = priceClothes * 0.25;
        double priceAccessories = priceBall * 0.2;

        double totalCost = costPerYear + priceAccessories + priceBall + priceClothes + priceTrainers;

        System.out.printf("%.2f",totalCost);

    }
}
