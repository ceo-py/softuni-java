import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();

    // Check if a is slow, average, fast, ultra fast, or extremely fast
    // and print the appropriate message
    if (a <= 10) {
      System.out.println("slow");
    } else if (a <= 50) {
      System.out.println("average");
    } else if (a <= 150) {
      System.out.println("fast");
    } else if (a <= 1000) {
      System.out.println("ultra fast");
    } else {
      System.out.println("extremely fast");
    }
  }
}
