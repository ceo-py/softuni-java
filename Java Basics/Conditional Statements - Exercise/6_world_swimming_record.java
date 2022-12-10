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
