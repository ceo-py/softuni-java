import java.util.Scanner;

public class Flowers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemumCount = Integer.parseInt(scanner.nextLine());
        int roseCount = Integer.parseInt(scanner.nextLine());
        int tulipCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String ifWeekend = scanner.nextLine();

        double bouquetPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                bouquetPrice = chrysanthemumCount * 2 + roseCount * 4.1 + tulipCount * 2.5;

                if (ifWeekend.equals("Y")) {
                    bouquetPrice *= 1.15;
                }

                if (tulipCount > 7 && season.equals("Spring")) {
                    bouquetPrice *= 0.95;
                }
                break;
            case "Autumn":
            case "Winter":
                bouquetPrice = chrysanthemumCount * 3.75 + roseCount * 4.5 + tulipCount * 4.15;

                if (ifWeekend.equals("Y")) {
                    bouquetPrice *= 1.15;
                }

                if (roseCount >= 10 && season.equals("Winter")) {
                    bouquetPrice *= 0.9;
                }
                break;
        }
        if (chrysanthemumCount + roseCount + tulipCount > 20) {
            bouquetPrice *= 0.8;
        }
        double finalBouquetPrice = bouquetPrice + 2;

        System.out.printf("%.2f", finalBouquetPrice);
    }
}
