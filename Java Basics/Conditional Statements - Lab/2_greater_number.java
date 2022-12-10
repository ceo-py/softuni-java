import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    // Check if a is greater than b and print the
    // appropriate value
    if (a > b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }
  }
}
