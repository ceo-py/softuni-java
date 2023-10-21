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



//
// import java.util.Scanner;
//
// public class _05_GodzillaVsKong {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         double budget = Double.parseDouble(scanner.nextLine());
//         int actors = Integer.parseInt(scanner.nextLine());
//         double pricePerCostume = Double.parseDouble(scanner.nextLine());
//
//         // Изчисляваме разходите за филма
//         double decor = budget * 0.10;
//         double costumesPrice = actors * pricePerCostume;
//
//         // Отстъпка за цената на облеклото при повече от 150 статиста -> 10%
//         if (actors > 150) {
//             costumesPrice = costumesPrice - (costumesPrice * 0.10);
//         }
//
//         // Цената за направата на филма
//         double moviePrice = decor + costumesPrice;
//
//         if (moviePrice <= budget) {
//             System.out.println("Action!");
//             System.out.printf("Wingard starts filming with %.2f leva left.", budget - moviePrice);
//         } else {
//             System.out.println("Not enough money!");
//             System.out.printf("Wingard needs %.2f leva more.", moviePrice - budget);
//         }
//     }
// }