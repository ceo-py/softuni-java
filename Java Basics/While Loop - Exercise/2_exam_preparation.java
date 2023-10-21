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



// import java.util.Scanner;
//
// public class ExamPreparation {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         int failedTaskAvailability = Integer.parseInt(scanner.nextLine());
//
//         int failedTasks = 0;
//         int totalTasks = 0;
//         double totalGrades = 0.00;
//         String lastProblem = "";
//
//         // Начало:
//         String taskName = scanner.nextLine();
//
//         // Условие за край:
//         while (!taskName.equals("Enough")) {
//
//             int mark = Integer.parseInt(scanner.nextLine());
//             totalTasks++;
//             totalGrades += mark;
//
//             if (mark <= 4) {
//                 failedTasks++;
//                 if (failedTasks == failedTaskAvailability) {
//                     System.out.printf("You need a break, %d poor grades.", failedTasks);
//                     return;
//                 }
//             }
//
//             lastProblem = taskName;
//
//             // Стъпка напред (прочитаме следващата задача):
//             taskName = scanner.nextLine();
//         }
//
//         System.out.printf("Average score: %.2f\n", totalGrades / totalTasks);
//         System.out.printf("Number of problems: %d\n", totalTasks);
//         System.out.printf("Last problem: %s\n", lastProblem);
//     }
// }