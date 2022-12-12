import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int numberGroups = in.nextInt();

    int fivePeopleGroups = 0;
    int sixToTwelveGroups = 0;
    int thirteenPeopleGroups = 0;
    int twentySixPeopleGroups = 0;
    int overFortyOnePeopleGroups = 0;
    int totalPeople = 0;
    int totalMusala = 0;
    int totalMonblan = 0;
    int totalKilimandjaro = 0;
    int totalKtwo = 0;
    int totalEverest = 0;

    for (int groups = 0; groups < numberGroups; groups++) {
      int group = in.nextInt();
      totalPeople += group;
      if (group <= 5) {
        fivePeopleGroups += 1;
        totalMusala += group;
      } else if (5 < group && group <= 12) {
        sixToTwelveGroups += 1;
        totalMonblan += group;
      } else if (12 < group && group <= 25) {
        thirteenPeopleGroups += 1;
        totalKilimandjaro += group;
      } else if (25 < group && group <= 40) {
        twentySixPeopleGroups += 1;
        totalKtwo += group;
      } else if (group > 40) {
        overFortyOnePeopleGroups += 1;
        totalEverest += group;
      }
    }

    double musala = (double) totalMusala / totalPeople * 100;
    double monblan = (double) totalMonblan / totalPeople * 100;
    double kilimandjaro = (double) totalKilimandjaro / totalPeople * 100;
    double ktwo = (double) totalKtwo / totalPeople * 100;
    double everest = (double) totalEverest / totalPeople * 100;

    System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n", musala, monblan, kilimandjaro, ktwo, everest);
  }
}