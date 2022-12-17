import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Predicate<String> isUpperCase = word -> Character.toUpperCase(word.charAt(0)) == word.charAt(0);

        String[] uppercaseWords = Arrays.stream(bufferedReader.readLine().split("\\s+")).filter(isUpperCase::test).toArray(String[]::new);

        System.out.println(uppercaseWords.length);
        Arrays.stream(uppercaseWords).forEach(System.out::println);
    }
}