import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;

        switch (groupType) {
            case "Students":
                switch (day) {
                    case "Friday":
                        totalPrice = groupSize * 8.45;
                        if (groupSize >= 30) {
                            totalPrice *= 0.85;
                        }
                        break;
                    case "Saturday":
                        totalPrice = groupSize * 9.8;
                        if (groupSize >= 30) {
                            totalPrice *= 0.85;
                        }
                        break;
                    case "Sunday":
                        totalPrice = groupSize * 10.46;
                        if (groupSize >= 30) {
                            totalPrice *= 0.85;
                        }
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        totalPrice = groupSize * 10.9;
                        if (groupSize >= 100) {
                            totalPrice = (groupSize - 10) * 10.9;
                        }
                        break;
                    case "Saturday":
                        totalPrice = groupSize * 15.6;
                        if (groupSize >= 100) {
                            totalPrice = (groupSize - 10) * 15.6;
                        }
                        break;
                    case "Sunday":
                        totalPrice = groupSize * 16;
                        if (groupSize >= 100) {
                            totalPrice = (groupSize - 10) * 16;
                        }
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        totalPrice = groupSize * 15;
                        if (groupSize >= 10 && groupSize <= 20) {
                            totalPrice *= 0.95;
                        }
                        break;
                    case "Saturday":
                        totalPrice = groupSize * 20;
                        if (groupSize >= 10 && groupSize <= 20) {
                            totalPrice *= 0.95;
                        }
                        break;
                    case "Sunday":
                        totalPrice = groupSize * 22.5;
                        if (groupSize >= 10 && groupSize <= 20) {
                            totalPrice *= 0.95;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);



    }
}
