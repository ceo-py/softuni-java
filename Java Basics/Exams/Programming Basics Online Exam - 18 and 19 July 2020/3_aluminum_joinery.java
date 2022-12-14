import java.util.Scanner;

public class AluminumJoinery03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberJoinery = Integer.parseInt(scanner.nextLine());
        String typeJoinery = scanner.nextLine();
        String deliveryMethod = scanner.nextLine();

        double totalPrice = 0;

        switch (typeJoinery) {
            case "90X130":
                if (numberJoinery > 60) {
                    totalPrice = numberJoinery * 110 * 0.92;
                } else if (numberJoinery > 30) {
                    totalPrice = numberJoinery * 110 * 0.95;
                } else {
                    totalPrice = numberJoinery * 110;
                }
                break;
            case "100X150":
                if (numberJoinery > 80) {
                    totalPrice = numberJoinery * 140 * 0.9;
                } else if (numberJoinery > 40) {
                    totalPrice = numberJoinery * 140 * 0.94;
                } else {
                    totalPrice = numberJoinery * 140;
                }
                break;
            case "130X180":
                if (numberJoinery > 50) {
                    totalPrice = numberJoinery * 190 * 0.88;
                } else if (numberJoinery > 20) {
                    totalPrice = numberJoinery * 190 * 0.93;
                } else {
                    totalPrice = numberJoinery * 190;
                }
                break;
            case "200X300":
                if (numberJoinery > 50) {
                    totalPrice = numberJoinery * 250 * 0.86;
                } else if (numberJoinery > 25) {
                    totalPrice = numberJoinery * 250 * 0.91;
                } else {
                    totalPrice = numberJoinery * 250;
                }
                break;
        }

        if (numberJoinery < 10) {
            System.out.println("Invalid order");
        } else {
            if (deliveryMethod.equals("With delivery")) {
                totalPrice += 60;
            }
            if (numberJoinery > 99) {
                totalPrice *= 0.96;
            }
            System.out.printf("%.2f BGN", totalPrice);
        }
    }
}
