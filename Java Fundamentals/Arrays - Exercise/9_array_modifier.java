import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandInput = command.split(" ");
            switch (commandInput[0]) {
                case "swap":
                    int temp = numbers[Integer.parseInt(commandInput[1])];
                    numbers[Integer.parseInt(commandInput[1])] = numbers[Integer.parseInt(commandInput[2])];
                    numbers[Integer.parseInt(commandInput[2])] = temp;
                    break;
                case "multiply":
                    int n1 = numbers[Integer.parseInt(commandInput[1])];
                    int n2 = numbers[Integer.parseInt(commandInput[2])];
                    numbers[Integer.parseInt(commandInput[1])] = n1 * n2;
                    break;
                case "decrease":
                    for (int i = 0; i <= numbers.length - 1; i++) {
                        numbers[i] -= 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
    }
}
