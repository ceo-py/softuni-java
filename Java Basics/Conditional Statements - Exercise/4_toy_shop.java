import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    double vacationPrice = sc.nextDouble();
    int puzzle = sc.nextInt();
    int dolls = sc.nextInt();
    int teddy = sc.nextInt();
    int minions = sc.nextInt();
    int truck = sc.nextInt();

    // Calculate the total price and profit
    double puzzlePrice = puzzle * 2.60;
    double dollsPrice = dolls * 3;
    double teddyPrice = teddy * 4.10;
    double minionsPrice = minions * 8.20;
    double truckPrice = truck * 2;

    int totalOrderNumber = puzzle + dolls + teddy + minions + truck;
    double totalPrice = puzzlePrice + dollsPrice + teddyPrice + minionsPrice + truckPrice;

    if (totalOrderNumber >= 50) {
      totalPrice = totalPrice - (totalPrice * 0.25);
    }

    double rent = totalPrice * 0.1;
    double finalAmount = totalPrice - rent;
    double profit = Math.abs(finalAmount - vacationPrice);

    // Print the result
    if (finalAmount >= vacationPrice) {
      System.out.printf("Yes! %.2f lv left.\n", profit);
    } else {
      System.out.printf("Not enough money! %.2f lv needed.\n", profit);
    }
  }
}
