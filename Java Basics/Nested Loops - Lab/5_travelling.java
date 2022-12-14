import java.util.Scanner;

public class Travelling05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());

            double sumSaved = 0;
            double sum = Double.parseDouble(scanner.nextLine());
            ;

            while (sumSaved < budget) {
                sumSaved += sum;

                if (sumSaved >= budget) {
                    System.out.printf("Going to %s!%n", destination);
                    break;
                }
                sum = Double.parseDouble(scanner.nextLine());
            }
            destination = scanner.nextLine();
        }

    }
}
