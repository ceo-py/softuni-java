import java.util.Scanner;

public class AddAndSubtract05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());


        System.out.println(subtractThirdNum(AddFirstTwoNum(first, second), third));

    }

    public static int AddFirstTwoNum (int a, int b) {
        return a + b;
    }

    public static int subtractThirdNum (int a, int b) {
        return a - b;
    }
}
