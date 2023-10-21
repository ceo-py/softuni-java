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



// import java.util.Scanner;
//
// public class _04_ToyShop {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         double tripPrice = Double.parseDouble(scanner.nextLine());
//         int puzzles = Integer.parseInt(scanner.nextLine());
//         int dolls = Integer.parseInt(scanner.nextLine());
//         int teddyBears = Integer.parseInt(scanner.nextLine());
//         int minions = Integer.parseInt(scanner.nextLine());
//         int trucks = Integer.parseInt(scanner.nextLine());
//
//         // Общата цена на поръчката
//         double orderPrice = (puzzles * 2.60) + (dolls * 3.00) + (teddyBears * 4.10) + (minions * 8.20) + (trucks * 2.00);
//
//         // Ако броя на играчките е над/или 50 правим отстъпка от 25%
//         int toysCount = puzzles + dolls + teddyBears + minions + trucks;
//         if (toysCount >= 50) {
//             orderPrice = orderPrice - (orderPrice * 0.25);
//         }
//
//         // Махаме 10% от цената за наем на магазина
//         orderPrice = orderPrice - (orderPrice * 0.10);
//
//         if (orderPrice >= tripPrice) {
//             System.out.printf("Yes! %.2f lv left.", orderPrice - tripPrice);
//         } else {
//             System.out.printf("Not enough money! %.2f lv needed.", tripPrice - orderPrice);
//         }
//     }
// }
