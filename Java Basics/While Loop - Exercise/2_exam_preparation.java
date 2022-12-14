import java.util.Scanner;

public class ExamPreparation02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int threshold = Integer.parseInt(scanner.nextLine());

        String taskName = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());

        double average = 0;
        int sum = 0;
        int taskCount = 0;
        int failCount = 0;
        String lastTask = "";

        while (!taskName.equals("Enough")) {
            lastTask = taskName;

            if (grade <= 4) {
                failCount++;
            }
            if (failCount == threshold) {
                System.out.printf("You need a break, %d poor grades.", failCount);
                break;
            }
            taskCount++;
            sum += grade;
            average = sum * 1.0 / taskCount;
            taskName = scanner.nextLine();
            if (taskName.equals("Enough")) {
                break;
            }
            grade = Integer.parseInt(scanner.nextLine());

        } if (taskName.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", taskCount);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}
