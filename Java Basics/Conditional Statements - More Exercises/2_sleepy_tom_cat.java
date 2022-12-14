import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysBreak = Integer.parseInt(scanner.nextLine());

        int daysWork = 365 - daysBreak;
        int minutesBreak = daysBreak * 127;
        int minutesWork = daysWork * 63;

        int norm = 30000 - (minutesBreak + minutesWork);
        int hours = norm / 60;
        double minutes = norm % 60;


        if (norm >= 0) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %.0f minutes less for play", hours, minutes);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %.0f minutes more for play", Math.abs(hours), Math.abs(minutes));
        }
    }
}
