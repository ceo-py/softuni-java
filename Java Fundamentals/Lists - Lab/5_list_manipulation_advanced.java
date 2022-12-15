import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] action = input.split(" ");

            switch (action[0]) {
                case "Contains":
                    if (numberList.contains(Integer.valueOf(action[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (action[1]){
                        case "even":
                            System.out.println(printEvenNumbers(numberList));
                            break;
                        case "odd":
                            System.out.println(printOddNumbers(numberList));
                            break;
                    }
                    break;
                case "Get":
                    System.out.println(sumNumbers(numberList));
                    break;
                case "Filter":
                    switch (action[1]) {
                        case ">":
                            System.out.println(filterBiggerNumbers(numberList, Integer.parseInt(action[2])));
                            break;
                        case ">=":
                            System.out.println(filterBiggerOrEqualNumbers(numberList, Integer.parseInt(action[2])));
                            break;
                        case "<":
                            System.out.println(filterSmallerNumbers(numberList, Integer.parseInt(action[2])));
                            break;
                        case "<=":
                            System.out.println(filterSmallerOrEqualNumbers(numberList, Integer.parseInt(action[2])));
                            break;

                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }

    public static String printEvenNumbers (List<Integer> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                result += list.get(i) + " ";
            }
        }
        return result;
    }

    public static String printOddNumbers (List<Integer> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                result += list.get(i) + " ";
            }
        }
        return result;
    }

    public static String sumNumbers (List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        String result = String.valueOf(sum);
        return result;
    }

    public static String filterBiggerNumbers (List<Integer> list, int number) {
        String result = "";
        for (int num : list) {
            if (num > number) {
                result += num + " ";
            }
        }
        return result;
    }

    public static String filterSmallerNumbers (List<Integer> list, int number) {
        String result = "";
        for (int num : list) {
            if (num < number) {
                result += num + " ";
            }
        }
        return result;
    }

    public static String filterBiggerOrEqualNumbers (List<Integer> list, int number) {
        String result = "";
        for (int num : list) {
            if (num >= number) {
                result += num + " ";
            }
        }
        return result;
    }

    public static String filterSmallerOrEqualNumbers (List<Integer> list, int number) {
        String result = "";
        for (int num : list) {
            if (num <= number) {
                result += num + " ";
            }
        }
        return result;
    }

}
