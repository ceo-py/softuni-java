import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] action = input.split(" ");
            int item = 0;
            int index = 0;
            switch (action[0]) {
                case "Add":
                    item = Integer.parseInt(action[1]);
                    numberList.add(item);
                    break;
                case "Remove":
                    item = Integer.parseInt(action[1]);
                    numberList.remove(Integer.valueOf(item));
                    break;
                case "RemoveAt":
                    index = Integer.parseInt(action[1]);
                    numberList.remove(index);
                    break;
                case "Insert":
                    item = Integer.parseInt(action[1]);
                    index = Integer.parseInt(action[2]);
                    numberList.add(index, item);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
    }
}
