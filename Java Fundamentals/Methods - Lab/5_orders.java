import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        calcTotalPrice(product, quantity);
    }

    public static void calcTotalPrice (String product, int quantity) {

        switch (product) {
            case "coffee":
                System.out.printf("%.2f", quantity * 1.5);
                break;
            case "water":
                System.out.printf("%.2f", quantity * 1.0);
                break;
            case "coke":
                System.out.printf("%.2f", quantity * 1.4);
                break;
            case "snacks":
                System.out.printf("%.2f", quantity * 2.0);
                break;

        }
    }
}
