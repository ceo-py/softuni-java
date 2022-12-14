import java.util.Scanner;

public class FitnessCenter05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());

        int counterBack = 0;
        int counterChest = 0;
        int counterLegs = 0;
        int counterAbs = 0;
        int counterProteinShake = 0;
        int counterProteinBar = 0;

        for (int i = 1; i <= visitors; i++) {
            String activity = scanner.nextLine();

            switch (activity) {
                case "Back":
                    counterBack++;
                    break;
                case "Legs":
                    counterLegs++;
                    break;
                case "Chest":
                    counterChest++;
                    break;
                case "Abs":
                    counterAbs++;
                    break;
                case "Protein shake":
                    counterProteinShake++;
                    break;
                case "Protein bar":
                    counterProteinBar++;
                    break;
            }
        }
        double totalWorkOut = counterAbs + counterBack + counterChest + counterLegs;
        double totalProtein = counterProteinBar + counterProteinShake;

        System.out.printf("%d - back%n", counterBack);
        System.out.printf("%d - chest%n", counterChest);
        System.out.printf("%d - legs%n", counterLegs);
        System.out.printf("%d - abs%n", counterAbs);
        System.out.printf("%d - protein shake%n", counterProteinShake);
        System.out.printf("%d - protein bar%n", counterProteinBar);
        System.out.printf("%.2f%% - work out%n", totalWorkOut / visitors * 100.0);
        System.out.printf("%.2f%% - protein", totalProtein / visitors * 100.0);
    }
}
