import java.util.Scanner;

public class OscarsWeekInCinema03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String typeHall = scanner.nextLine();
        int ticketsBought = Integer.parseInt(scanner.nextLine());

        double totalRevenue = 0;

        switch (movieName) {
            case "A Star Is Born":
                switch (typeHall) {
                    case "normal":
                        totalRevenue = ticketsBought * 7.5;
                        break;
                    case "luxury":
                        totalRevenue = ticketsBought * 10.5;
                        break;
                    case "ultra luxury":
                        totalRevenue = ticketsBought * 13.5;
                        break;
                }
                break;
            case "Bohemian Rhapsody":
                switch (typeHall) {
                    case "normal":
                        totalRevenue = ticketsBought * 7.35;
                        break;
                    case "luxury":
                        totalRevenue = ticketsBought * 9.45;
                        break;
                    case "ultra luxury":
                        totalRevenue = ticketsBought * 12.75;
                        break;
                }
                break;
            case "Green Book":
                switch (typeHall) {
                    case "normal":
                        totalRevenue = ticketsBought * 8.15;
                        break;
                    case "luxury":
                        totalRevenue = ticketsBought * 10.25;
                        break;
                    case "ultra luxury":
                        totalRevenue = ticketsBought * 13.25;
                        break;
                }
                break;
            case "The Favourite":
                switch (typeHall) {
                    case "normal":
                        totalRevenue = ticketsBought * 8.75;
                        break;
                    case "luxury":
                        totalRevenue = ticketsBought * 11.55;
                        break;
                    case "ultra luxury":
                        totalRevenue = ticketsBought * 13.95;
                        break;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movieName, totalRevenue);
    }
}
