import java.util.Scanner;

public class EasterShop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEggs = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int eggsSold = 0;

        while (!command.equals("Close")) {
            int eggsTraded = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case "Buy":
                    if (totalEggs < eggsTraded) {
                        System.out.println("Not enough eggs in store!");
                        System.out.printf("You can buy only %d.", totalEggs);
                        break;
                    } else {
                    totalEggs -= eggsTraded;
                    eggsSold += eggsTraded;
                    break;
                    }
                case "Fill":
                    totalEggs += eggsTraded;
                    break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", eggsSold);
        }
    }
}
