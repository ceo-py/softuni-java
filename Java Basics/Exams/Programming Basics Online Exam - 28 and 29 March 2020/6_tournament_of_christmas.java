import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int tournamentDays = scanner.nextInt();
    int totalWins = 0;
    double totalMoney = 0;

    for (int i = 0; i < tournamentDays; i++) {
      int currentDayWins = 0;
      double currentDayMoney = 0;

      while (true) {
        String sport = scanner.next();
        if (sport.equals("Finish")) {
          totalWins += currentDayWins;
          if (currentDayWins > 0) {
            currentDayMoney *= 1.1;
          }
          totalMoney += currentDayMoney;
          break;
        }

        String gameOutput = scanner.next();

        if (gameOutput.equals("win")) {
          currentDayWins += 1;
          currentDayMoney += 20;
        } else if (gameOutput.equals("lose")) {
          currentDayWins -= 1;
        }
      }
    }

    if (totalWins > 0) {
      totalMoney *= 1.2;
      System.out.printf("You won the tournament! Total raised money: %.2f\n", totalMoney);
    } else {
      System.out.printf("You lost the tournament! Total raised money: %.2f\n", totalMoney);
    }
  }
}
