import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    // Calculate and print the result
    if (a <= 100) {
      if (a % 2 == 0) {
        System.out.println(5 + 1);
        System.out.println(a + 6);
      } else if (a % 10 == 5) {
        System.out.println(5 + 2);
        System.out.println(a + 7);
      } else if (a % 2 != 0) {
        System.out.println(5);
        System.out.println(a + 5);
      }
    }
    if (a >= 100 && a <= 1000) {
      double b = a * 0.20;
      if (a % 2 == 0) {
        System.out.println(1 + b);
        System.out.println(a + b + 1);
      } else if (a % 10 == 5) {
        System.out.println(2 + b);
        System.out.println(a + b + 2);
      } else if (a % 2 != 0) {
        System.out.println(b);
        System.out.println(a + b);
      }
    }
    if (a > 1000) {
      double b = a * 0.10;
      if (a % 2 == 0) {
        System.out.println(1 + b);
        System.out.println(a + b + 1);
      } else if (a % 10 == 5) {
        System.out.println(2 + b);
        System.out.println(a + b + 2);
      } else if (a % 2 != 0) {
        System.out.println(b);
        System.out.println(a + b);
      }
    }
  }
}



// import java.util.Scanner;
//
// public class _02_BonusScore {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         int number = Integer.parseInt(scanner.nextLine());
//         double points = 0.00;
//
//         // числата по-малки или равни на 100 - 5т.
//         // числата по-малки или равни на 1000 - 20% от числото
//         // във всеки останал случай - 10% от числото
//         if (number <= 100) {
//             points = 5;
//         } else if (number <= 1000) {
//             points = number * 0.20;
//         } else {
//             points = number * 0.10;
//         }
//
//         // Проверка дали числото е четно
//         if (number % 2 == 0) {
//             points = points + 1;
//         }
//
//         // Проверка дали числото завършва на 5
//         if (number % 10 == 5) {
//             points = points + 2;
//         }
//
//         System.out.println(points);
//         System.out.println(number + points);
//     }
// }
