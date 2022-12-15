import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TreasureHunt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();
        String treasure = Arrays.toString(items).replace("[", "").replace("]", "");
        ;

        while (!command.equals("Yohoho!")) {
            String[] action = command.split(" ");

            if (action[0].equals("Loot")) {
                for (int i = 1; i <= action.length - 1; i++) {
                    boolean isPresent = false;
                    for (int j = 0; j <= items.length - 1; j++) {
                        if (items[j].equals(action[i])) {
                            isPresent = true;
                            break;
                        }
                    }
                    if (!isPresent) {
                        String temp = action[i];
                        treasure = temp + ", " + treasure;
                    }
                }
            } else if (action[0].equals("Drop")) {
                String[] temp = treasure.split(", ");
                if (Integer.parseInt(action[1]) > temp.length - 1 || Integer.parseInt(action[1]) < 0) {
                    command = scanner.nextLine();
                    continue;
                } else {
                    for (int i = 1; i < 2; i++) {
                        String first = temp[Integer.parseInt(action[1])];
                        for (int j = Integer.parseInt(action[1]); j < temp.length - 1; j++) {
                            temp[j] = temp[j + 1];
                        }
                        temp[temp.length - 1] = first;
                    }
                }
                treasure = Arrays.toString(temp).replace("[", "").replace("]", "");

            } else if (action[0].equals("Steal")) {
                String[] temp = treasure.split(", ");
                int stealCount = Integer.parseInt(action[1]);
                for (int i = temp.length - stealCount; i <= temp.length - 1; i++) {
                    if (i == temp.length - 1) {
                        System.out.println(temp[i]);
                    } else {
                        System.out.print(temp[i] + ", ");
                    }
                        temp[i] = "";
                }
                treasure = Arrays.toString(temp).replace("[", "").replace("]", "");
            } else
            command = scanner.nextLine();
        }
        String [] finalTreasure = treasure.split(", ");
        if (finalTreasure.length == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            double averageSum = 0;
            int numberItems = 0;

            for (int i = 0; i <= finalTreasure.length - 1; i++) {
                averageSum += finalTreasure[i].length();
                numberItems++;
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", (averageSum / numberItems));

        }

    }
}
