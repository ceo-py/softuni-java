import java.util.Scanner;

public class Easter_Shop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startEggs = Integer.parseInt(scanner.nextLine());
        String comand = scanner.nextLine();

        int eggsBuy = 0;

        while (!comand.equals("Close")) {
            if (comand.equals("Fill")) {
                int eggsNum = Integer.parseInt(scanner.nextLine());
                startEggs += eggsNum;
            }
            if (comand.equals("Buy")) {
                int eggsNum = Integer.parseInt(scanner.nextLine());

                if (eggsNum <= startEggs) {
                    startEggs -= eggsNum;
                    eggsBuy += eggsNum;
                } else {
                    System.out.printf("Not enough eggs in store!%n");
                    System.out.printf("You can buy only %d.", startEggs);
                    break;
                }
            }

            comand = scanner.nextLine();
        }

        if (comand.equals("Close")) {
            System.out.printf("Store is closed!%n");
            System.out.printf("%d eggs sold.", eggsBuy);
        }

    }
}