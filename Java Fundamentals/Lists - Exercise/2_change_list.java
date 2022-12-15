import java.util.*;
import java.util.stream.Collectors;

public class ChangeList02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] action = input.split(" ");

            switch (action[0]) {
                case "Delete":
                    int element = Integer.parseInt(action[1]);
                    ArrayList<Integer> removedNumbers = new ArrayList<>();
                    removedNumbers.add(element);
                    numberList.removeAll(removedNumbers);

                    break;
                case "Insert":
                    int item = Integer.parseInt(action[1]);
                    int index = Integer.parseInt(action[2]);
                    numberList.add(index, item);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
    }

}


