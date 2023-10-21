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



// import java.util.Scanner;
//
// public class LunchBreak {
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         //Име на сериал – текст
//         //Продължителност на епизод  – цяло число в диапазона [10… 90]
//         //Продължителност на почивката  – цяло число в диапазона [10… 120]
//         String seriesName = scanner.nextLine();
//         int episodeDuration = Integer.parseInt(scanner.nextLine());
//         int lunchBreak = Integer.parseInt(scanner.nextLine());
//
//         // Време за хпване - 1/8
//         // Време за отдих - 1/4
//
//         double timeForEating = lunchBreak / 8.00;
//         double timeForResting = lunchBreak / 4.00;
//
//         double freeTime = lunchBreak - timeForEating - timeForResting;
//
//         if (freeTime >= episodeDuration) {
//             System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
//                     seriesName, Math.ceil(freeTime - episodeDuration));
//         } else {
//             System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
//                     seriesName, Math.ceil(episodeDuration - freeTime));}
//     }
// }