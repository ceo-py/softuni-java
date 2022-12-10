import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    double sqm = 7.61 * sc.nextFloat();

    // Calculate the discount and print the results
    double discount = sqm * 0.18;
    System.out.println("The final price is " + (sqm - discount) + " lv.");
    System.out.println("The discount is: " + discount + " lv.");
  }
}