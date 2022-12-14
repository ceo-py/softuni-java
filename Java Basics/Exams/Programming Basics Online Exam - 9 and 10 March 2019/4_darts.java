import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        String command = scanner.nextLine();

        int totalPoints = 301;
        int successfulStrikes = 0;
        int failStrikes = 0;

        while (!command.equals("Retire")) {
            int points = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case "Single":
                    if (points > totalPoints) {
                        failStrikes++;
                        break;
                    } else {
                        successfulStrikes++;
                        totalPoints -= points;
                    }
                    break;
                case "Double":
                    if (points * 2 > totalPoints) {
                        failStrikes++;
                        break;
                    } else {
                        successfulStrikes++;
                        totalPoints -= points *2;
                    }
                    break;
                case "Triple":
                    if (points * 3 > totalPoints) {
                        failStrikes++;
                        break;
                    } else {
                        successfulStrikes++;
                        totalPoints -= points * 3;
                    }
                    break;
            }
            if (totalPoints == 0) {
                System.out.printf("%s won the leg with %d shots.", playerName, successfulStrikes);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", playerName, failStrikes);
        }
    }
}
