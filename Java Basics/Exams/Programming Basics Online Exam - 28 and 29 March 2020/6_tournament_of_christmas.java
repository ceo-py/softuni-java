import java.util.Scanner;

public class Tournament_Of_Christmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String sport = "";

        int totalWins = 0;
        int totalLoses = 0;

        int end = 0;
        boolean flag = false;

        int dayWins = 0;
        int dayLoses = 0;
        double wonMoneyPerDay = 0;
        double totalMoney = 0;

        for (int a = 1; a <= days; a++) {
            totalMoney += wonMoneyPerDay;

            while (!sport.equals("Finish")) {
                sport = scanner.nextLine();

                if (sport.equals("Finish")) {
                    end++;
                    if (dayWins > dayLoses) {
                        wonMoneyPerDay *= 1.1;
                    }
                    if (end >= days) {
                        flag = true;
                        break;
                    }
                    sport = scanner.nextLine();
                }
                String score = scanner.nextLine();

                if (score.equals("win")) {
                    dayWins++;
                    totalWins++;
                    wonMoneyPerDay += 20;
                }
                if (score.equals("lose")) {
                    dayLoses++;
                    totalLoses++;
                }
            }
            if (flag) {
                break;
            }
        }

        if (totalWins > totalLoses) {
            double finalMoney = totalMoney * 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", finalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}