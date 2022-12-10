import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    int b = sc.nextInt();
    int c = 3;

    // Print the information with a sentence
    System.out.println("The architect " + a + " will need " + (b * c) + " hours to complete " + b + " project/s.");
  }
}
