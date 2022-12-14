import java.util.Scanner;

public class MovieStars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        double pay = 0;

        while (!name.equals("ACTION")) {

            if (name.length() <= 15) {
                pay = Double.parseDouble(scanner.nextLine());
                budget -= pay;
            } else {
                pay = budget * 0.2;
                budget -= pay;
            }

            if (budget < 0) {
                System.out.printf("We need %.2f leva for our actors.", Math.abs((budget + pay) - pay));
                break;
            }
            name = scanner.nextLine();
        }
        if (budget >= 0) {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
