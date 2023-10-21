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



//
// import java.util.Scanner;
//
// public class AgencyProfit {
//
//     public static void main(String[] args) {
//
//         // 1. Прочитаме входните данни.
//         Scanner scanner = new Scanner(System.in);
//
//         String airline = scanner.nextLine();
//         int adultTickets = Integer.parseInt(scanner.nextLine());
//         int childTickets = Integer.parseInt(scanner.nextLine());
//         double adultTicketPrice = Double.parseDouble(scanner.nextLine());
//         double additionalFee = Double.parseDouble(scanner.nextLine());
//
//         // 2. Изчисляваме цената на всички продадени билети.
//         // - Изчисляваме цената на детският билет.
//         double childTicketPrice = adultTicketPrice * (30 / 100.0);
//
//         // - Начисляваме допълнителната такса към цената на билетите.
//         adultTicketPrice = adultTicketPrice + additionalFee;
//         childTicketPrice = childTicketPrice + additionalFee;
//
//         // - Изчисляваме общата цена на билетите.
//         double totalProfit = (adultTickets * adultTicketPrice) + (childTickets * childTicketPrice);
//
//         // 3. Изчисляваме крайната печалба на Агенцията (20% от общата цената на билетите).
//         double agencyProfit = totalProfit * (20 / 100.0);
//
//         // 4. Принтираме на конзолата печалбата с 2 знака след десетичната запетая.
//         System.out.printf("The profit of your agency from %s tickets is %.2f lv.%n", airline, agencyProfit);
//     }
// }