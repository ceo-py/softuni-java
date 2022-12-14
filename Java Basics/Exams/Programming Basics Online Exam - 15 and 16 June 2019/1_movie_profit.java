import java.util.Scanner;

public class MovieProfit01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double income = days * tickets * priceTicket - (days * tickets * priceTicket * percent / 100);

        System.out.printf("The profit from the movie %s is %.2f lv.", movie, income);
    }
}
