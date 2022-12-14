import java.util.Scanner;

public class Cat_Walking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int totalMin = min * walks;
        int totalCalories = totalMin * 5;
        double result = 0.5 * calories;

        if (totalCalories >= result) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", totalCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", totalCalories);
        }

    }
}