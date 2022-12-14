import java.util.Scanner;

public class Grades04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalStudents = Integer.parseInt(scanner.nextLine());

        int F = 0;
        int D = 0;
        int C = 0;
        int B = 0;
        double totalGrades = 0;
        for (int i = 1; i <= totalStudents ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 3) {
                F++;
                totalGrades += grade;
            } else if (grade < 4) {
                D++;
                totalGrades += grade;
            } else if (grade < 5) {
                C++;
                totalGrades += grade;
            } else {
                B++;
                totalGrades += grade;
            }

        }
        System.out.printf("Top students: %.2f%%%n", B * 1.0 / totalStudents * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", C * 1.0 / totalStudents * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", D * 1.0 / totalStudents * 100);
        System.out.printf("Fail: %.2f%%%n", F * 1.0 / totalStudents * 100);
        System.out.printf("Average: %.2f", totalGrades / totalStudents);

    }
}
