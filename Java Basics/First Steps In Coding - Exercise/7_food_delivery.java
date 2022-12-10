import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    float a = sc.nextInt() * 10.35f;
    float b = sc.nextInt() * 12.40f;
    float c = sc.nextInt() * 8.15f;

    // Calculate the result and print it
    float m_total = a + b + c;
    float d_price = m_total * 0.20f;
    float total = m_total + d_price + 2.50f;
    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println(df.format(total));
  }
}
