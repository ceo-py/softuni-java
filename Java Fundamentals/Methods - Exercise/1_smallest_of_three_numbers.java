import java.util.Scanner;

public class SmallestOfThreeNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestInt(a, b, c));
    }

    public static int smallestInt (int a, int b, int c) {
        int smallest = 0;

        if (a > b && b < c) {
            smallest = b;
        } else if (b > a && a < c) {
            smallest = a;
        } else {
            smallest = c;
        }
        return smallest;
    }
}
