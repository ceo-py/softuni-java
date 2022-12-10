import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = "s3cr3t!P@ssw0rd";

    // Check if a is equal to b and print the
    // appropriate message
    if (a.equals(b)) {
      System.out.println("Welcome");
    } else {
      System.out.println("Wrong password!");
    }
  }
}
