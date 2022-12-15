import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int listSize = numberList.size();

        for (int i = 0; i < listSize / 2; i++) {
            int first = numberList.get(i);
            int second = numberList.get(numberList.size() - 1 );

            numberList.set(i, first + second);
            numberList.remove(numberList.size() - 1);
        }

        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
    }
}
