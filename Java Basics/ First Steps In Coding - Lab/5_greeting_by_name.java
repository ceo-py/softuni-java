import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read a name from the user
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();

    // Print the name with a greeting
    System.out.println("Hello, " + name + "!");
  }
}
