import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split(" ");
            String action = command[0];


            switch (action) {
                case "Add":
                    int numberToAdd = Integer.parseInt(command[1]);
                    numberList.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(command[1]);
                    int insertIndex = Integer.parseInt(command[2]);
                    if (insertIndex < 0 || insertIndex > numberList.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        numberList.add(insertIndex, numberToInsert);
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(command[1]);

                    if (indexToRemove < 0 || indexToRemove > numberList.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        numberList.remove(Integer.parseInt(command[1]));
                    }
                    break;
                case "Shift":
                    String side = command[1];
                    int rotations = Integer.parseInt(command[2]);
                    switch (side) {
                        case "right":
                            shiftListToRight(numberList, rotations);
                            break;
                        case "left":
                            shiftListToLeft(numberList, rotations);
                            break;
                    }
                    break;
                default:
                    break;
            }

            input = scanner.nextLine();
        }

        for (int number : numberList) {
            System.out.print(number + " ");
        }
    }

    public static List<Integer> shiftListToLeft(List<Integer> list, int rotations) {
        for (int i = 0; i < rotations; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        return list;
    }

    public static List<Integer> shiftListToRight(List<Integer> list, int rotations) {
        for (int i = 0; i < rotations; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        return list;
    }
}
