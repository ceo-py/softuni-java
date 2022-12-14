import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double profitBeforeTax = magnolias * 3.25 + hyacinths * 4 + roses * 3.5 + cacti * 8;
        double profitAfterTax = profitBeforeTax * 0.95;

        if (profitAfterTax >= priceGift) {
            System.out.printf("She is left with %.0f leva.", Math.floor(profitAfterTax - priceGift));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(priceGift - profitAfterTax));
        }
    }
}
