import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    int previousSum = scanner.nextInt() + scanner.nextInt();

    int maxDifference = 0;
    for (int i = 1; i < count; i++) {
      int currentSum = scanner.nextInt() + scanner.nextInt();
      maxDifference = Math.max(maxDifference, Math.abs(previousSum - currentSum));
      previousSum = currentSum;
    }

    if (maxDifference == 0) {
      System.out.println("Yes, value=" + previousSum);
    } else {
      System.out.println("No, maxdiff=" + maxDifference);
    }
  }
}
