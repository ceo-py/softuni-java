import java.util.Scanner;
import java.util.PriorityQueue;

public class LargestNumbers {
  public static void main(String[] args) {
    PriorityQueue<Integer> numbers = new PriorityQueue<>((a, b) -> b - a);

    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextInt()) {
      numbers.add(scanner.nextInt());
    }
    if (numbers.size() >= 3) {
      System.out.print(numbers.poll() + " ");
      System.out.print(numbers.poll() + " ");
      System.out.print(numbers.poll());
    } else {
      while (!numbers.isEmpty()) {
        System.out.print(numbers.poll() + " ");
      }
    }
  }
}
