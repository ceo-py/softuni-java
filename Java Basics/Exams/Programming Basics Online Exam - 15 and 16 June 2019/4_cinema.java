import java.util.Scanner;

public class Cinema04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double income = 0;

        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);

            if (people <= capacity) {
                capacity -= people;
                income += people * 5;
                if (people % 3 == 0) {
                    income -= 5;
                }
            } else {
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %.0f lv.", income);
                break;
            }
            input = scanner.nextLine();
        }

        if (input.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", capacity);
            System.out.printf("Cinema income - %.0f lv.", income);
        }
    }
}
