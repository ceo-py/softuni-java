import java.util.Scanner;

public class EasterDecoration06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());

        int itemsSold = 0;
        double totalSpend = 0;
        double averageSpend = 0;

        for (int i = 1; i <= clients ; i++) {
            String purchasedItem = scanner.nextLine();

            while (!purchasedItem.equals("Finish")) {
                itemsSold++;

                switch (purchasedItem) {
                    case "basket":
                        totalSpend += 1.5;
                        break;
                    case "wreath":
                        totalSpend += 3.8;
                        break;
                    case "chocolate bunny":
                        totalSpend += 7;
                        break;
                }
                purchasedItem = scanner.nextLine();
            }
            if (itemsSold % 2 == 0) {
                totalSpend *= 0.8;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", itemsSold, totalSpend);
            itemsSold = 0;
            averageSpend += totalSpend;
            totalSpend = 0;
        }
        System.out.printf("Average bill per client is: %.2f leva.", averageSpend / clients);
    }
}
