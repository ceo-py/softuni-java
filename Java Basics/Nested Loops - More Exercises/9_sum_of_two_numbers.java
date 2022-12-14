import java.util.Scanner;

public class Sum_Of_Two_Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int combinationNum = 0;
        int combination;
        boolean flag = false;
        boolean thereIs = true;


        for (int number = first; number <= last; number++) {
            for (int number1 = first; number1 <= last; number1++) {
                combination = number + number1;
                combinationNum++;

                if (combination == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationNum, number, number1, magic);
                    thereIs = false;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        if (thereIs) {
            System.out.printf("%d combinations - neither equals %d", combinationNum, magic);
        }

    }
}