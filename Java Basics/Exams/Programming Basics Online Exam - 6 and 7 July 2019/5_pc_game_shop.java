import java.util.Scanner;

public class PCGameShop05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberGamesSold = Integer.parseInt(scanner.nextLine());

        double hearthstone = 0;
        double fornite = 0;
        double overwatch = 0;
        double others = 0;

        for (int i = 1; i <= numberGamesSold ; i++) {
            String gameName = scanner.nextLine();

            switch (gameName) {
                case "Hearthstone":
                    hearthstone++;
                    break;
                case "Fornite":
                    fornite++;
                    break;
                case "Overwatch":
                    overwatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", (hearthstone / numberGamesSold) * 100.0);
        System.out.printf("Fornite - %.2f%%%n", (fornite / numberGamesSold) * 100.0);
        System.out.printf("Overwatch - %.2f%%%n", (overwatch / numberGamesSold) * 100.0);
        System.out.printf("Others - %.2f%%", (others / numberGamesSold) * 100.0);
    }
}
