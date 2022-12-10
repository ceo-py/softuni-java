import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    // Check if a is less than 100, between 100 and 200, or greater than 200
    // and print the appropriate message
    if (a <= 99) {
      System.out.println("Less than 100");
    } else if (a >= 100 && a <= 200) {
      System.out.println("Between 100 and 200");
    } else {
      System.out.println("Greater than 200");
    }
  }
}
