import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int hour = scanner.nextInt();
    String day = scanner.next();

    if (10 <= hour && hour <= 18 && !day.equals("Sunday")) {
      System.out.println("open");
    } else {
      System.out.println("closed");
    }
  }
}
