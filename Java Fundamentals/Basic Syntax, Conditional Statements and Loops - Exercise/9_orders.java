import java.util.Scanner;

public class Orders09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orderCount = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        for (int i = 1; i <= orderCount; i++) {
            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsule = Integer.parseInt(scanner.nextLine());

            double sum = (days * countCapsule) * priceCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", sum);

            totalSum += sum;
            sum = 0;
        }
        System.out.printf("Total: $%.2f", totalSum);
    }

}

