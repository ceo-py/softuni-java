import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    // Calculate the result and print it
    double result = (a * 2.50) + (b * 4);
    System.out.println(result + " lv.");
  }
}
