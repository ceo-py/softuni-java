import java.util.Scanner;

public class Logistics03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freights = Integer.parseInt(scanner.nextLine());

        int minibus = 0;
        int truck = 0;
        int train = 0;

        double totalTons = 0;
        double price = 0;

        for (int i = 1; i <= freights ; i++) {
            double freightWeight = Double.parseDouble(scanner.nextLine());
            totalTons += freightWeight;

            if (freightWeight <= 3) {
                minibus += freightWeight;
                price += freightWeight * 200;
            } else if (freightWeight <= 11) {

                truck += freightWeight;
                price += freightWeight * 175;
            } else {

                train += freightWeight;
                price += freightWeight * 120;
            }

        }
        System.out.printf("%.2f%n", price / totalTons);
        System.out.printf("%.2f%%%n", minibus / totalTons * 100);
        System.out.printf("%.2f%%%n", truck / totalTons * 100);
        System.out.printf("%.2f%%", train / totalTons * 100);
    }
}
