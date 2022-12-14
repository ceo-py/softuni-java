import java.util.Scanner;

public class Graduation08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double mark = Double.parseDouble(scanner.nextLine());

        double average = 0;
        double sum = 0;
        int fails = 0;
        int grade = 0;

        while (grade < 13) {
            sum += mark;
            average = sum / grade;

            if (mark < 4) {
                fails++;
                if (fails >= 2) {
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    break;
                }
            }
            if (grade == 12) {
                System.out.printf("%s graduated. Average grade: %.2f", name, average);
                grade++;
                break;
            } else {
                mark = Double.parseDouble(scanner.nextLine());
                grade++;
            }

        }
    }
}
