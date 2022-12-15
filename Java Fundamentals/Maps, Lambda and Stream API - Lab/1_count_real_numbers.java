import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numberOccurrences = new TreeMap<>();

        for (double number : numbers) {
            if (!numberOccurrences.containsKey(number)) {
                numberOccurrences.put(number, 1);
            } else {
                numberOccurrences.put(number, numberOccurrences.get(number) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numberOccurrences.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %s%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
