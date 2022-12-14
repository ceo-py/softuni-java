import java.util.Scanner;

public class EasterBake05 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());
        int totalSugar = 0;
        int totalFlour = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= easterBreads ; i++) {
            int sugarUsed = Integer.parseInt(scanner.nextLine());
            int flourUsed = Integer.parseInt(scanner.nextLine());

            totalSugar += sugarUsed;
            totalFlour += flourUsed;

            if (sugarUsed >= maxSugar) {
                maxSugar = sugarUsed;
            }
            if (flourUsed >= maxFlour) {
                maxFlour = flourUsed;
            }
        }
        double flourPacks = Math.ceil(totalFlour / 750.0);
        double sugarPacks = Math.ceil(totalSugar / 950.0);

        System.out.printf("Sugar: %.0f%n", sugarPacks);
        System.out.printf("Flour: %.0f%n", flourPacks);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
