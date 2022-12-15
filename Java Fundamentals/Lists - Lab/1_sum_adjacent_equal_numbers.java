import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numberList.size() - 1; i++) {
            double firstNumber = numberList.get(i);
            double secondNumber = numberList.get(i + 1);

            if (firstNumber == secondNumber) {
                numberList.set(i, numberList.get(i) + numberList.get(i + 1));
                numberList.remove(i + 1);
                i = -1;
            }
        }
        DecimalFormat df = new DecimalFormat("0.#");
        for (Double item : numberList) {
            System.out.print(df.format(item) + " ");
        }
        //System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
    }
}
