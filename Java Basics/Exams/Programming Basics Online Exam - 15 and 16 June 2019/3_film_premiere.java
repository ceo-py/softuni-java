import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String typePackage = scanner.nextLine();
        int numberTickets = Integer.parseInt(scanner.nextLine());

        double cost = 0;

        switch (movieName) {
            case "John Wick":
                switch (typePackage) {
                    case "Drink":
                        cost = numberTickets * 12;
                        break;
                    case "Popcorn":
                        cost = numberTickets * 15;
                        break;
                    case "Menu":
                        cost = numberTickets * 19;
                        break;
                }
                break;
            case "Star Wars":
                switch (typePackage) {
                    case "Drink":
                        cost = numberTickets * 18;
                        break;
                    case "Popcorn":
                        cost = numberTickets * 25;
                        break;
                    case "Menu":
                        cost = numberTickets * 30;
                        break;
                }
                break;
            case "Jumanji":
                switch (typePackage) {
                    case "Drink":
                        cost = numberTickets * 9;
                        break;
                    case "Popcorn":
                        cost = numberTickets * 11;
                        break;
                    case "Menu":
                        cost = numberTickets * 14;
                        break;
                }
                break;
        }
        if (movieName.equals("Star Wars") && numberTickets >= 4) {
            cost *= 0.7;
        }
        if (movieName.equals("Jumanji") && numberTickets == 2) {
            cost *= 0.85;
        }

        System.out.printf("Your bill is %.2f leva.", cost);
    }
}
