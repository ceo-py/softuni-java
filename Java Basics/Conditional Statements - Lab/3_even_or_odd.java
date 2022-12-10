import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    // Check if a is even or odd and print the
    // appropriate message
    if ((a % 2) == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }
}
