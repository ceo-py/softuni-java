import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    double radians = sc.nextDouble();

    // Calculate the result and print it
    System.out.println(radians * 180 / Math.PI);
  }
}
