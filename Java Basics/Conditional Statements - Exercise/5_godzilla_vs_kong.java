import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    double filmBudget = sc.nextDouble();
    int countExtras = sc.nextInt();
    double pricePerOneExtra = sc.nextDouble();

    // Calculate the total cost
    double decoratorExpenses = filmBudget * 0.10;
    double extrasOverOnehundredOff = 0.10;
    double gearForExtras;
    if (countExtras > 150) {
      gearForExtras = countExtras * pricePerOneExtra;
      gearForExtras = gearForExtras - (gearForExtras * extrasOverOnehundredOff);
    } else {
      gearForExtras = countExtras * pricePerOneExtra;
    }

    gearForExtras += decoratorExpenses;

    // Print the result
    if (filmBudget >= gearForExtras) {
      double totalMovieCost = filmBudget - gearForExtras;
      System.out.printf("Action!\nWingard starts filming with %.2f leva left.\n", totalMovieCost);
    } else {
      double totalMovieCost = gearForExtras - filmBudget;
      System.out.printf("Not enough money!\nWingard needs %.2f leva more.\n", totalMovieCost);
    }
  }
}
