import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int size = scanner.nextInt();


    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size - i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }

    for (int i = size - 1; i >= 1; i--) {
      for (int j = 1; j <= size - i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
