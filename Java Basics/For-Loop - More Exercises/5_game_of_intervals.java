import java.util.Scanner;

public class GameOfIntervals05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());

        double points = 0;
        int to9 = 0;
        int to19 = 0;
        int to29 = 0;
        int to39 = 0;
        int to50 = 0;
        int invalid = 0;

        for (int i = 1; i <= inputCount ; i++) {
           int input = Integer.parseInt(scanner.nextLine());

           if (input < 0 || input > 50) {
               invalid++;
               points /= 2;
           } else if (input >= 0 && input <= 9) {
               to9++;
               points += input * 0.2;
           } else if (input <= 19) {
               to19++;
               points += input * 0.3;
           } else if (input <= 29) {
               to29++;
               points += input * 0.4;
           } else if (input <= 39) {
               to39++;
               points += 50;
           } else if (input >= 40 && input <= 50) {
               to50++;
               points += 100;
           }
        }
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", to9 * 1.0 / inputCount * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", to19 * 1.0 / inputCount * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", to29 * 1.0 / inputCount * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", to39 * 1.0 / inputCount * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", to50 * 1.0 / inputCount * 100);
        System.out.printf("Invalid numbers: %.2f%%", invalid * 1.0 / inputCount * 100);

    }
}
