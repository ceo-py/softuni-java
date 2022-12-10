import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double budget = scanner.nextDouble();
    int videoCards = scanner.nextInt();
    int processors = scanner.nextInt();
    int ramMemory = scanner.nextInt();

    double videoCardsOff = 0.15;
    double videoCardsPricePerUnit = 250;
    double processorsOff = 0.35;
    double ramMemoryOff = 0.10;

    double videoCardsTotal = videoCards * videoCardsPricePerUnit;
    double processorsPrice = (videoCardsTotal * processorsOff) * processors;
    double ramMemoryPrice = (videoCardsTotal * ramMemoryOff) * ramMemory;
    double totalOrderPrice = videoCardsTotal + processorsPrice + ramMemoryPrice;

    if (budget >= totalOrderPrice) {
      if (videoCards > processors) {
        totalOrderPrice -= totalOrderPrice * videoCardsOff;
        totalOrderPrice = budget - totalOrderPrice;
        System.out.printf("You have %.2f leva left!", totalOrderPrice);
      } else {
        totalOrderPrice = budget - totalOrderPrice;
        System.out.printf("You have %.2f leva left!", totalOrderPrice);
      }
    } else {
      if (videoCards > processors) {
        totalOrderPrice -= totalOrderPrice * videoCardsOff;
        totalOrderPrice = totalOrderPrice - budget;
        System.out.printf("Not enough money! You need %.2f leva more!", totalOrderPrice);
      } else {
        totalOrderPrice = totalOrderPrice - budget;
        System.out.printf("Not enough money! You need %.2f leva more!", totalOrderPrice);
      }
    }

    scanner.close();
  }
}