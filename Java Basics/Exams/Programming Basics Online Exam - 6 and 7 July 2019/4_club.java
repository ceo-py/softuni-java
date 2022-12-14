import java.util.Scanner;

public class Club04 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double expectedRevenue = Double.parseDouble(scanner.nextLine());
        String cocktail = scanner.nextLine();

        double sales = 0;

        while (!cocktail.equals("Party!")) {
            int cocktailCount = Integer.parseInt(scanner.nextLine());

            double cocktailPrice = cocktail.length();
            double cocktailSales = cocktailCount * cocktailPrice;

            if (cocktailSales % 2 != 0) {
                cocktailSales *= 0.75;
            }
            sales += cocktailSales;

            if (sales >= expectedRevenue) {
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f leva.", sales);
                break;
            }
            cocktail = scanner.nextLine();
        }

        if (cocktail.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", expectedRevenue - sales);
            System.out.printf("Club income - %.2f leva.", sales);

        }
    }
}