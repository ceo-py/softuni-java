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
