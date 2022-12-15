import java.util.Arrays;
import java.util.Scanner;

public class WordFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).filter(e -> e.length() % 2 == 0).toArray(String[] :: new);

        for (String word : inputArr) {
            System.out.println(word);
        }

        StringBuilder sb = new StringBuilder();

















//        List<String> outputList = new ArrayList<>();
//
//        for (int i = 0; i < inputArr.length; i++) {
//            String currentElement = inputArr[i];
//            if (currentElement.length() % 2 == 0) {
//                outputList.add(currentElement);
//            }
//        }
//
//        for (String word : outputList) {
//            System.out.println(word);
//        }

    }
}
