import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();

    // Calculate and print the area of the shape
    if (a.equals("square")) {
      float b = sc.nextFloat();
      System.out.format("%.3f%n", b*b);
    } else if (a.equals("rectangle")) {
      float b = sc.nextFloat();
      float c = sc.nextFloat();
      System.out.format("%.3f%n", b * c);
    } else if (a.equals("circle")) {
      float b = sc.nextFloat();
      System.out.format("%.3f%n", Math.PI * b * b);
    } else if (a.equals("triangle")) {
      float b = sc.nextFloat();
      float c = sc.nextFloat();
      System.out.format("%.3f%n", b * c / 2);
    }
  }
}
