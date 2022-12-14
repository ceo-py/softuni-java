import java.util.Scanner;

public class Travel_Agency_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double dayPrice = 0;

        switch (city) {
            case "Bansko":
            case "Borovets":
                switch (pack) {
                    case "withEquipment":
                        dayPrice = 100;
                        switch (vip) {
                            case "yes":
                                dayPrice *= 0.9;
                                break;
                        }
                        if (days > 7) {
                            System.out.printf("The price is %.2flv! Have a nice time!", (days * dayPrice) - dayPrice);
                        } else if  (days < 7 && days > 1) {
                            System.out.printf("The price is %.2flv! Have a nice time!", days * dayPrice);
                        } else {
                            System.out.println("Days must be positive number!");
                        }
                        break;
                    case "noEquipment":
                        dayPrice = 80;
                        switch (vip) {
                            case "yes":
                                dayPrice *= 0.95;
                                break;
                        }
                        if (days > 7) {
                            System.out.printf("The price is %.2flv! Have a nice time!", (days * dayPrice) - dayPrice);
                        } else if  (days < 7 && days > 1) {
                            System.out.printf("The price is %.2flv! Have a nice time!", days * dayPrice);
                        } else {
                            System.out.println("Days must be positive number!");
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
                break;
            case "Varna":
            case "Burgas":
                switch (pack) {
                    case "withBreakfast":
                        dayPrice = 130;
                        switch (vip) {
                            case "yes":
                                dayPrice *= 0.88;
                                break;
                        }
                        if (days > 7) {
                            System.out.printf("The price is %.2flv! Have a nice time!", (days * dayPrice) - dayPrice);
                        } else if  (days < 7 && days > 1) {
                            System.out.printf("The price is %.2flv! Have a nice time!", days * dayPrice);
                        } else {
                            System.out.println("Days must be positive number!");
                        }
                        break;
                    case "noBreakfast":
                        dayPrice = 100;
                        switch (vip) {
                            case "yes":
                                dayPrice *= 0.93;
                                break;
                        }
                        if (days > 7) {
                            System.out.printf("The price is %.2flv! Have a nice time!", (days * dayPrice) - dayPrice);
                        } else if  (days < 7 && days > 1) {
                            System.out.printf("The price is %.2flv! Have a nice time!", days * dayPrice);
                        } else {
                            System.out.println("Days must be positive number!");
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}