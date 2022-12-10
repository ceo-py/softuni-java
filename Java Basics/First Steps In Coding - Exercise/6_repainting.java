import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    int nylon_amount_mt = sc.nextInt();
    int paint_amount_lt = sc.nextInt();
    int thinner_amount_lt = sc.nextInt();
    int hours = sc.nextInt();

    // Calculate the result and print it
    double amount_nylon = (nylon_amount_mt + 2) * 1.50;
    double amount_paint = (paint_amount_lt * 1.1) * 14.50;
    double amount_thinner = thinner_amount_lt * 5.00;
    double amount_bags = 0.40;
    double all_amount = amount_nylon + amount_paint + amount_thinner + amount_bags;
    double amount_masters = (all_amount * 0.30) * hours;
    double total_amount = all_amount + amount_masters;
    System.out.println(total_amount);
  }
}
