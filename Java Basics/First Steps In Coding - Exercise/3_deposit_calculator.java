import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    int b = sc.nextInt();
    double c = sc.nextFloat() / 100;

    // Calculate the result and print it
    double interest = a * c;
    double m_interest = interest / 12;
    double total = a + (m_interest * b);
    System.out.println(total);
  }
}
