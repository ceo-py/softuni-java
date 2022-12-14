import java.util.Scanner;

public class TravelAgency03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String typePackage = scanner.nextLine();
        String VIPDiscount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());


        if (days > 7) {
            days--;
        }
        double totalSum = 0;

        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else {
            switch (city) {
                case "Bansko":
                case "Borovets":
                    switch (typePackage) {
                        case "noEquipment":
                            switch (VIPDiscount) {
                                case "yes":
                                    totalSum = days * 80 * 0.95;
                                    break;
                                case "no":
                                    totalSum = days * 80;
                                    break;
                            }
                            break;
                        case "withEquipment":
                            switch (VIPDiscount) {
                                case "yes":
                                    totalSum = days * 100 * 0.90;
                                    break;
                                case "no":
                                    totalSum = days * 100;
                                    break;
                            }
                    } System.out.printf("The price is %.2flv! Have a nice time!", totalSum);
                    break;
                case "Varna":
                case "Burgas":
                    switch (typePackage) {
                        case "noBreakfast":
                            switch (VIPDiscount) {
                                case "yes":
                                    totalSum = days * 100 * 0.93;
                                    break;
                                case "no":
                                    totalSum = days * 100;
                                    break;
                            }
                            break;
                        case "withBreakfast":
                            switch (VIPDiscount) {
                                case "yes":
                                    totalSum = days * 130 * 0.88;
                                    break;
                                case "no":
                                    totalSum = days * 130;
                                    break;
                            }
                    }
                    System.out.printf("The price is %.2flv! Have a nice time!", totalSum);
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }
}
