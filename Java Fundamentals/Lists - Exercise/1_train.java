import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] action = input.split(" ");

            switch (action[0]) {
                case "Add":
                    numberList.add(Integer.parseInt(action[1]));
                    break;
                default:
                    int current = Integer.parseInt(action[0]);

                    for (int i = 0; i < numberList.size(); i++) {
                        if (numberList.get(i) + current <= capacity) {
                            numberList.set(i, numberList.get(i) + current);
                            break;
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
    }
}

