import java.util.Scanner;

public class Dishwasher01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottlesDetergent = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int counter = 0;
        double detergent = bottlesDetergent * 750;
        int dishCounter = 0;
        int potCounter = 0;

        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);
            counter++;

            if (counter % 3 == 0) {
                detergent -= dishes * 15;
                potCounter += dishes;
            } else {
                detergent -= dishes * 5;
                dishCounter += dishes;
            }

            if (detergent < 0) {
                System.out.printf("Not enough detergent, %.0f ml. more necessary!", Math.abs(detergent));
                break;
            }
            input = scanner.nextLine();
        }
        if (detergent >= 0) {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", dishCounter, potCounter);
            System.out.printf("Leftover detergent %.0f ml.", detergent);
        }
    }
}
