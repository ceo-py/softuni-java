import java.util.Scanner;

public class PoolDay01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        Double tax = Double.parseDouble(scanner.nextLine());
        double priceSunBed = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double totalSum = people * tax + priceSunBed * Math.ceil(people * 0.75) + Math.ceil(people / 2.0) * priceUmbrella;

        System.out.printf("%.2f lv.", totalSum);

    }
}
