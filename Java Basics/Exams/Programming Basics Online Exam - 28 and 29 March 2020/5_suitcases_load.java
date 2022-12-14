import java.util.Scanner;

public class Suitcases_Load_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allSpace = Double.parseDouble(scanner.nextLine());
        String capacity = scanner.nextLine();

        int suitcase = 0;

        while (!capacity.equals("End")) {
            double capacity1 = Double.parseDouble(capacity);

            suitcase++;

            if (suitcase % 3 == 0) {
                capacity1 *= 1.1;
            }
            if (capacity1 > allSpace) {
                suitcase--;
                break;
            }

            allSpace -= capacity1;
            capacity = scanner.nextLine();

        }

        if (capacity.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcase);
    }
}