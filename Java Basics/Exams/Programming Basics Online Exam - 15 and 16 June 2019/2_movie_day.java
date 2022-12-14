import java.util.Scanner;

public class MovieDay02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeShooting = Integer.parseInt(scanner.nextLine());
        int numberScenes = Integer.parseInt(scanner.nextLine());
        int timePerScene = Integer.parseInt(scanner.nextLine());

        double totalTime = numberScenes * timePerScene + timeShooting * 0.15;

        if (totalTime <= timeShooting) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(timeShooting - totalTime));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(totalTime - timeShooting));
        }
    }
}
