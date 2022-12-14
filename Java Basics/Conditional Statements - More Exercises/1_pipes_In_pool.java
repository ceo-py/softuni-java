import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volume = Integer.parseInt(scanner.nextLine());
        int debit = Integer.parseInt(scanner.nextLine());
        int debit2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pipeOne = debit * hours;
        double pipeTwo = debit2 * hours;
        double totalLitres = pipeOne + pipeTwo;
        double percentageFull = totalLitres / volume * 100;
        double percentagePipeOne = pipeOne / totalLitres * 100;
        double percentagePipeTwo = pipeTwo / totalLitres * 100;

        if (totalLitres <= volume) {
            System.out.printf("The pool is %.2f", percentageFull);
            System.out.print("%. Pipe 1: ");
            System.out.printf("%.2f", percentagePipeOne);
            System.out.print("%. Pipe 2: ");
            System.out.printf("%.2f", percentagePipeTwo);
            System.out.print("%.");
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, Math.abs(totalLitres - volume));
        }
    }
}
