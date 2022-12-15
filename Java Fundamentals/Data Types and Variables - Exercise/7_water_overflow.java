import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLines = Integer.parseInt(scanner.nextLine());
        double totalLitres = 0;


        for (int i = 1; i <= inputLines; i++) {
            double quantityWater = Double.parseDouble(scanner.nextLine());

            if (quantityWater <= 255 - totalLitres) {
                totalLitres += quantityWater;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.printf("%.0f", totalLitres);
    }
}
