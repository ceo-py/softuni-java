import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String partOfDay = scanner.nextLine();

        double price = 0;

        if (km < 20) {
            if (partOfDay.equals("day")) {
                price = 0.70 + km * 0.79;
            } else {
                price = 0.70 + km * 0.9;
            }
        } else if (km < 100) {
            price = km * 0.09;
        } else {
            price = km * 0.06;
        }
        System.out.printf("%.2f", price);
    }
}
