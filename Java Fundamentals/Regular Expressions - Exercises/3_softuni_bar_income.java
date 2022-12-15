import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<customer>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|$%\\.]*\\|[^\\|$%\\.\\d]*(?<count>\\d+)[^\\|$%\\.\\d]*\\|[^\\|$%\\.\\d]*(?<price>\\d+\\.*\\d+)[^\\|$%\\.\\d]*\\$";
        double totalIncome = 0;
        String input = scanner.nextLine();

        while (!input.equals("end of shift")) {

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                System.out.printf("%s: %s - %.2f%n", matcher.group("customer"), matcher.group("product"), Integer.parseInt(matcher.group("count")) * Double.parseDouble(matcher.group("price")));
                totalIncome += (Integer.parseInt(matcher.group("count")) * Double.parseDouble(matcher.group("price")));
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
