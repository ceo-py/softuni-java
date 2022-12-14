import java.util.Scanner;

public class EasterEggs05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsPainted = Integer.parseInt(scanner.nextLine());

        int eggsRed = 0;
        int eggsOrange = 0;
        int eggsBlue = 0;
        int eggsGreen = 0;
        int eggsMax = Integer.MIN_VALUE;
        String eggWinner = "";

        for (int i = 1; i <= eggsPainted ; i++) {
            String eggColour = scanner.nextLine();

            switch (eggColour) {
                case "red":
                    eggsRed++;
                    if (eggsRed >= eggsMax) {
                        eggsMax = eggsRed;
                        eggWinner = eggColour;
                    }
                    break;
                case "orange":
                    eggsOrange++;
                    if (eggsOrange >= eggsMax) {
                        eggsMax = eggsOrange;
                        eggWinner = eggColour;
                    }
                    break;
                case "blue":
                    eggsBlue++;
                    if (eggsBlue >= eggsMax) {
                        eggsMax = eggsBlue;
                        eggWinner = eggColour;
                    }
                    break;
                case "green":
                    eggsGreen++;
                    if (eggsGreen >= eggsMax) {
                        eggsMax = eggsGreen;
                        eggWinner = eggColour;
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", eggsRed);
        System.out.printf("Orange eggs: %d%n", eggsOrange);
        System.out.printf("Blue eggs: %d%n", eggsBlue);
        System.out.printf("Green eggs: %d%n", eggsGreen);
        System.out.printf("Max eggs: %d -> %s", eggsMax, eggWinner);
    }
}
