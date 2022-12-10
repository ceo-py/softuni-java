import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Read the user's information
    Scanner sc = new Scanner(System.in);
    int hours = sc.nextInt();
    int minutes = sc.nextInt();

    // Calculate the total time and print the result
    int minutesAdded = 15;
    int totalMinutes = minutes + minutesAdded;
    if (totalMinutes >= 60) {
      int totalTime = hours + 1;
      int overSixtyMinutes = totalMinutes - 60;
      if (totalTime >= 24) {
        totalTime = 0;
        if (overSixtyMinutes < 10) {
          System.out.println(String.format("%d:0%d", totalTime, overSixtyMinutes));
        } else {
          System.out.println(String.format("%d:%d", totalTime, overSixtyMinutes));
        }
      } else {
        if (overSixtyMinutes < 10) {
          System.out.println(String.format("%d:0%d", totalTime, overSixtyMinutes));
        } else {
          System.out.println(String.format("%d:%d", totalTime, overSixtyMinutes));
        }
      }
    } else {
      if (totalMinutes < 10) {
        System.out.println(String.format("%d:0%d", hours, totalMinutes));
      } else {
        System.out.println(String.format("%d:%d", hours, totalMinutes));
      }
    }
  }
}
