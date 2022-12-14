import java.util.Scanner;

public class TennisEquipment01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceRacket = Double.parseDouble(scanner.nextLine());
        int numberRackets = Integer.parseInt(scanner.nextLine());
        int numberTrainers = Integer.parseInt(scanner.nextLine());

        double totalCost = (priceRacket * numberRackets + numberTrainers * priceRacket / 6) * 1.2;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(totalCost / 8));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(totalCost * 7 / 8));
    }
}
