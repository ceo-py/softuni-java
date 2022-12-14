import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grapevine = Integer.parseInt(scanner.nextLine());
        double grapesPerSqM = Double.parseDouble(scanner.nextLine());
        int wineNorm = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double wineProduced = (0.4 * (grapevine * grapesPerSqM)) / 2.5;

        if (wineProduced >= wineNorm) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n %.0f liters left -> %.0f liters per person.", Math.floor(wineProduced), Math.ceil(wineProduced - wineNorm), Math.ceil((wineProduced - wineNorm)/workers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineNorm - wineProduced));
        }

    }
}
