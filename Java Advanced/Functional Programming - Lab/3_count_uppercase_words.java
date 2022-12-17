import java.util.Scanner;
import java.util.function.Predicate;

public class UppercaseWords {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read a line of text from the console
    String line = scanner.nextLine();

    // Split the line into words
    String[] words = line.split("\\s+");

    // Define a predicate to test if a word starts with an uppercase letter
    Predicate<String> startsWithUppercase = (word) -> Character.isUpperCase(word.charAt(0));

    // Count the number of words that start with an uppercase letter
    int count = 0;
    for (String word : words) {
      if (startsWithUppercase.test(word)) {
        count++;
      }
    }

    // Print the count and the words
    System.out.println(count);
    for (String word : words) {
      if (startsWithUppercase.test(word)) {
        System.out.println(word);
      }
    }
  }
}
