import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String movieName = scanner.nextLine();

    int studentsTickets = 0;
    int standardTickets = 0;
    int kidsTickets = 0;
    int totalTickets = 0;

    while (!movieName.equals("Finish")) {
      int ticketsNumber = scanner.nextInt();
      scanner.nextLine(); // Consume the newline character from the previous input

      String ticketType = scanner.nextLine();
      int total = 0;

      while (true) {
        if (ticketType.equals("standard")) {
          standardTickets++;
        } else if (ticketType.equals("kid")) {
          kidsTickets++;
        } else if (ticketType.equals("student")) {
          studentsTickets++;
        }

        if (ticketType.equals("Finish") || total == ticketsNumber) {
          System.out.printf("%s - %.2f%% full.\n", movieName, (double) total / ticketsNumber * 100);
          movieName = ticketType;
          break;
        } else if (ticketType.equals("End")) {
          System.out.printf("%s - %.2f%% full.\n", movieName, (double) total / ticketsNumber * 100);
          movieName = scanner.nextLine();
          break;
        } else {
          total++;
          totalTickets++;
          ticketType = scanner.nextLine();
        }
      }
    }

    System.out.printf("Total tickets: %d\n", totalTickets);
    System.out.printf("%.2f%% student tickets.\n", (double) studentsTickets / totalTickets * 100);
    System.out.printf("%.2f%% standard tickets.\n", (double) standardTickets / totalTickets * 100);
    System.out.printf("%.2f%% kids tickets.\n", (double) kidsTickets / totalTickets * 100);
  }
}
