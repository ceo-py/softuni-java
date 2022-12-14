import java.util.Scanner;

public class Care_Of_Puppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKg = Integer.parseInt(scanner.nextLine());
        String comand = "";

        int foodG = foodKg * 1000;
        int foodTotal = 0;

        while (!comand.equals("Adopted")) {
            comand = scanner.nextLine();

            if (comand.equals("Adopted")) {
                break;
            } else {
                foodTotal += Integer.parseInt(comand);
            }
        }

        if (foodG >= foodTotal) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodG - foodTotal);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", foodTotal - foodG);
        }

    }
}