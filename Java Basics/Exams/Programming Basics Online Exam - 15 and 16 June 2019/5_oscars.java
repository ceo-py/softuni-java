import java.util.Scanner;

public class Oscars05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());
        boolean isNotEnough = true;

        double totalPoints = points;

        for (int i = 1; i <= juryCount ; i++) {
            String juryName = scanner.nextLine();
            double juryPointsGiven = Double.parseDouble(scanner.nextLine());

            totalPoints += juryName.length() * juryPointsGiven / 2.0;

            if (totalPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                isNotEnough = false;
                break;
            }
        }
        if (isNotEnough) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
        }
    }
}
