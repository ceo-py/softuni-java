import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    // Calculate the result and print it
    double snekers = a - (a * 0.40);
    double gear = snekers - (snekers * 0.20);
    double ball = gear / 4;
    double more = ball / 5;
    System.out.println(a + snekers + gear + ball + more);
  }
}