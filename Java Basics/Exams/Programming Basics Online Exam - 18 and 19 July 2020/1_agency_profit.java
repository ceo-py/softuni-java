import java.util.Scanner;

public class AgencyProfit01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int ticketsAdult = Integer.parseInt(scanner.nextLine());
        int ticketsChild = Integer.parseInt(scanner.nextLine());
        double priceAdultTicket = Double.parseDouble(scanner.nextLine());
        double fees = Double.parseDouble(scanner.nextLine());

        double totalPrice = ticketsAdult * priceAdultTicket + ticketsAdult * fees + (ticketsChild  * (priceAdultTicket * 0.3) + ticketsChild * fees);

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, totalPrice * 0.2);
    }
}
