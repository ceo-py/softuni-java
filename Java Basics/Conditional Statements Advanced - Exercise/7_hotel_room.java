import java.util.Scanner;

public class HotelRoom07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine().toLowerCase();
        int vacationDays = Integer.parseInt(scanner.nextLine());

        double studioCost = 0;
        double apartmentCost = 0;

        switch (month) {
            case "may":
            case "october":
                studioCost = 50 * vacationDays;
                apartmentCost = 65 * vacationDays;
                if (vacationDays <= 7) {
                    studioCost *= 1;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                } else if (vacationDays <= 14) {
                    studioCost *= 0.95;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                } else {
                    studioCost *= 0.7;
                    apartmentCost *= 0.9;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                }
                break;
            case "june":
            case "september":
                studioCost = 75.2 * vacationDays;
                apartmentCost = 68.7 * vacationDays;
                if (vacationDays > 14) {
                    studioCost *= 0.8;
                    apartmentCost *= 0.9;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                }
                break;
            case "july":
            case "august":
                studioCost = 76 * vacationDays;
                apartmentCost = 77 * vacationDays;
                if (vacationDays > 14) {
                    apartmentCost *= 0.9;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                }
                break;
        }
    }
}

