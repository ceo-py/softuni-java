import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    double record = sc.nextDouble();
    double distanceMeters = sc.nextDouble();
    double timeInSecPerMeter = sc.nextDouble();

    // Calculate the total time
    double slowingTimePerFifthenMeter = 12.5;
    double slowingTimeMeters = 15;
    double distanceNeedToSwim = distanceMeters * timeInSecPerMeter;
    double slowingTime = Math.floor(distanceMeters / slowingTimeMeters) * slowingTimePerFifthenMeter;
    double totalTime = distanceNeedToSwim + slowingTime;

    // Print the result
    if (record > totalTime) {
      System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.\n", totalTime);
    } else {
      totalTime = totalTime - record;
      System.out.printf("No, he failed! He was %.2f seconds slower.\n", totalTime);
    }
  }
}


//
// import java.util.Scanner;
//
// public class _06_WorldSwimmingRecord {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         double worldRecordInSeconds = Double.parseDouble(scanner.nextLine());
//         double distanceInMeters = Double.parseDouble(scanner.nextLine());
//         double timeInSecondsPerMeter = Double.parseDouble(scanner.nextLine());
//
//         // Изчисляваме за колко време ще преплува целия басейн
//         double swimmingTimeInSeconds = distanceInMeters * timeInSecondsPerMeter;
//
//         // ВАЖНО: на всеки 15 метра той се забавя с 12.5 секунди
//         // ВАЖНО: когато изчисляваме колко пъти се е забавил, трябва да закръглим до най-близкото цяло число надолу
//
//         double delayedTimes = Math.floor(distanceInMeters / 15);
//         swimmingTimeInSeconds = swimmingTimeInSeconds + (delayedTimes * 12.5);
//
//         if (swimmingTimeInSeconds < worldRecordInSeconds) {
//             System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimmingTimeInSeconds);
//         } else {
//             System.out.printf("No, he failed! He was %.2f seconds slower.", swimmingTimeInSeconds - worldRecordInSeconds);
//         }
//     }
// }
