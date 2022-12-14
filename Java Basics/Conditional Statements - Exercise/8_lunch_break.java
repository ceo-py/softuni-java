import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String series = scanner.nextLine();
        int timeSeries = Integer.parseInt(scanner.nextLine());
        int timeBreak = Integer.parseInt(scanner.nextLine());

        double timeBreakAdj = timeBreak - (timeBreak / 8.0 + timeBreak / 4.0);
        double leftTime = Math.abs(timeBreakAdj - timeSeries);
        if (timeBreakAdj >= timeSeries) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, Math.ceil(leftTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, Math.ceil(leftTime));
        }

    }
}
