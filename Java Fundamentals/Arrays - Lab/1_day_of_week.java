import java.util.Arrays;
import java.util.Scanner;

public class DayOfWeek01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (number > 0 && number <8) {
            System.out.println(daysOfWeek[number - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
