import java.util.Scanner;

public class SchoolCamp07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double totalPrice = 0;

        switch (season) {
            case "Winter":
                if (groupType.equals("boys") || (groupType.equals("girls"))) {
                    totalPrice = students * nights * 9.6;
                } else if (groupType.equals("mixed")) {
                    totalPrice = students * nights * 10;
                }
                break;
            case "Spring":
                if (groupType.equals("boys") || (groupType.equals("girls"))) {
                    totalPrice = students * nights * 7.2;
                } else if (groupType.equals("mixed")) {
                    totalPrice = students * nights * 9.5;
                }
                break;
            case "Summer":
                if (groupType.equals("boys") || (groupType.equals("girls"))) {
                    totalPrice = students * nights * 15;
                } else if (groupType.equals("mixed")) {
                    totalPrice = students * nights * 20;
                }
                break;
        }
        if (students >= 50) {
            totalPrice *= 0.5;
        } else if (students >= 20 && students < 50) {
            totalPrice *= 0.85;
        } else if (students >= 10 && students < 20) {
            totalPrice *= 0.95;
        }

        if (groupType.equals("girls")) {
            switch (season) {
                case "Winter":
                    sport = "Gymnastics";
                    break;
                case "Spring":
                    sport = "Athletics";
                    break;
                case "Summer":
                    sport = "Volleyball";
                    break;
            }
        } else if (groupType.equals("boys")) {
            switch (season) {
                case "Winter":
                    sport = "Judo";
                    break;
                case "Spring":
                    sport = "Tennis";
                    break;
                case "Summer":
                    sport = "Football";
                    break;
            }
        } else if (groupType.equals("mixed")) {
            switch (season) {
                case "Winter":
                    sport = "Ski";
                    break;
                case "Spring":
                    sport = "Cycling";
                    break;
                case "Summer":
                    sport = "Swimming";
                    break;
            }
        }
        System.out.printf("%s %.2f lv.", sport, totalPrice);
    }
}

