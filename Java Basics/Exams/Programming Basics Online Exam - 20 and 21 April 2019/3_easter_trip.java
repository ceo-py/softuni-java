import java.util.Scanner;

public class EasterTrip03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double totalCost = 0;

        switch (destination) {
            case "France":
                switch (dates) {
                    case "21-23":
                        totalCost = nights * 30;
                        break;
                    case "24-27":
                        totalCost = nights * 35;
                        break;
                    case "28-31":
                        totalCost = nights * 40;
                        break;
                } break;
            case "Italy":
                switch (dates) {
                    case "21-23":
                        totalCost = nights * 28;
                        break;
                    case "24-27":
                        totalCost = nights * 32;
                        break;
                    case "28-31":
                        totalCost = nights * 39;
                        break;
                } break;
            case "Germany":
                switch (dates) {
                    case "21-23":
                        totalCost = nights * 32;
                        break;
                    case "24-27":
                        totalCost = nights * 37;
                        break;
                    case "28-31":
                        totalCost = nights * 43;
                        break;
                } break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalCost);
    }
}
