import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();

    // Check if the value is greater than or equal to 5.50
    // and print the appropriate message
    if (a >= 5) {
      System.out.println("Excellent!");
    }
  }
}
