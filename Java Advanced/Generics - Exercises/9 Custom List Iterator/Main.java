import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    String element = tokens[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(tokens[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    String searchElement = tokens[1];
                    System.out.println(customList.contains(searchElement));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    customList.swap(index1, index2);
                    break;
                case "Greater":
                    String elementToCompare = tokens[1];
                    System.out.println(customList.countGreaterThan(elementToCompare));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    for (String string : customList) {
                        System.out.println(string);
                    }
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
            input = scanner.nextLine();
        }
    }
}