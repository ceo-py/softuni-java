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



// import java.util.Scanner;
//
// public class Main {
//     public static void main(String[] args) {
//
//         //1. Вход
//         //Бюджетът на Петър - реално число в интервала [0.0…100000.0]
//         //Броят видеокарти - цяло число в интервала [0…100]
//         //Броят процесори - цяло число в интервала [0…100]
//         //Броят рам памет - цяло число в интервала [0…100]
//         Scanner scanner = new Scanner(System.in);
//
//         double budget = Double.parseDouble(scanner.nextLine());
//         int videoCard = Integer.parseInt(scanner.nextLine());
//         int processor = Integer.parseInt(scanner.nextLine());
//         int memoryRAM = Integer.parseInt(scanner.nextLine());
//
//         //2. Изчисляване на поръчката
//
//         double videoCardPrice = videoCard * 250;
//
//         double processorPrice = processor * (videoCardPrice * 0.35);
//
//         double memoryRamPrice = memoryRAM * (videoCardPrice * 0.10);
//
//         double orderPrice = videoCardPrice + processorPrice + memoryRamPrice;
//
//         //3. Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка.
//         if (videoCard > processor) {
//             orderPrice = orderPrice - (orderPrice * 0.15);
//         }
//         //4. Принтиране
//         if (orderPrice <= budget) {
//             System.out.printf("You have %.2f leva left!", budget - orderPrice);
//         } else {
//             System.out.printf("Not enough money! You need %.2f leva more!", orderPrice - budget);
//         }
//
//     }
//
// }