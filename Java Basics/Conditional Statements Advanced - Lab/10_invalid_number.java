import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberCheck = scanner.nextInt();

    if (numberCheck == 0) {
      System.out.println("");
    } else if (numberCheck < 100 || numberCheck > 200) {
      System.out.println("invalid");
    }
  }
}
