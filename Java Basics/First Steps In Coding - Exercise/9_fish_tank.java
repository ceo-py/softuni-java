import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    double d = sc.nextFloat() / 100;

    // Calculate the result and print it
    int cm = a * b * c;
    double litri = cm * 0.001f;
    double total = litri * (1 - d);
    System.out.println(total);
  }
}
