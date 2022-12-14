import java.util.Scanner;

public class Walking04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String steps = scanner.nextLine();

        int stepsCount = 0;
        int stepsSum = 0;

        while (!steps.equals("Going home")) {
            stepsCount = Integer.parseInt(steps);
            stepsSum += stepsCount;

            if (stepsSum >= 10000){
                System.out.printf("Goal reached! Good job!%n");
                System.out.printf("%d steps over the goal!", stepsSum - 10000);
                break;
            }
            steps = scanner.nextLine();
        }
        switch (steps) {
            case "Going home":
                stepsCount = Integer.parseInt(scanner.nextLine());
                stepsSum += stepsCount;

                if (stepsSum >= 10000){
                    System.out.printf("Goal reached! Good job!%n");
                    System.out.printf("%d steps over the goal!", stepsSum - 10000);
                } else {
                    System.out.printf("%d more steps to reach goal.", 10000 - stepsSum);
                }
                break;
        }

    }
}
