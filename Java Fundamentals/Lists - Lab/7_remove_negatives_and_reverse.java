import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        if (positiveList(numberList).size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(positiveList(numberList).toString().replaceAll("[\\[\\],]", ""));
        }
    }

    public static List<Integer> positiveList (List<Integer> list) {
        List<Integer> resultList = new ArrayList<>();

        for (Integer number : list) {
            if (number > 0) {
                resultList.add(number);
            }
        }
        Collections.reverse(resultList);
        return resultList;
    }
}
