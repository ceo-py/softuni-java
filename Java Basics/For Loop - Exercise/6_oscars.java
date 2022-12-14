import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double totalPoints = academyPoints;

        for (int i = 1; i <= n; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            int nameLength = juryName.length();

            totalPoints += (nameLength * juryPoints / 2);

            if (totalPoints > 1250.5) {
                break;
            }
        }


        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, Math.abs(totalPoints - 1250.5));
        }
    }
}
