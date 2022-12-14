import java.util.Scanner;

public class Skeleton02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesQuota = Integer.parseInt(scanner.nextLine());
        int secondsQuota = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsPer100m = Integer.parseInt(scanner.nextLine());

        double timeQuota = minutesQuota * 60 + secondsQuota;

        double resistanceTime = length / 120 * 2.5;

        double timeMartin = (length / 100) * secondsPer100m - resistanceTime;

        if (timeMartin <= timeQuota) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeMartin);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", timeMartin - timeQuota);
        }
    }
}
