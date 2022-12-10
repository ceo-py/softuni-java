import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt() * 5.80f;
    double b = sc.nextInt() * 7.20f;
    double c = sc.nextInt() * 1.20f;
    double d = sc.nextInt() / 100f;

    // Calculate the result and print it
    double total = a + b + c;
    double result = total - (total * d);
    System.out.println(result);
  }
}
