import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s*");
        String regexHealth = "[^(\\d.+/*\\-)]";
        String regexDamage = "(?<damage>[\\+\\-]?\\d+\\.?\\d*)";
        String regexMultiOrDivision = "[*\\/]";


        for (int i = 0; i < input.length; i++) {
            String currentDemon = input[i];
            if (currentDemon.contains(" ")) {

                continue;
            }

            int health = 0;
            double damage = 0;

            Pattern patternHealth = Pattern.compile(regexHealth);
            Matcher matcherHealth = patternHealth.matcher(currentDemon);

            while (matcherHealth.find()) {
                char currentHealthChar = matcherHealth.group().charAt(0);
                health += currentHealthChar;
            }

            Pattern patternDamage = Pattern.compile(regexDamage);
            Matcher matcherDamage = patternDamage.matcher(currentDemon);

            while (matcherDamage.find()) {
                double amount = Double.parseDouble(matcherDamage.group("damage"));
                damage += amount;
            }

            Pattern additional = Pattern.compile(regexMultiOrDivision);
            Matcher matcherAdditional = additional.matcher(currentDemon);

            while (matcherAdditional.find()) {
                if (matcherAdditional.group().equals("*")) {
                    damage *= 2;
                } else {
                    damage /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", currentDemon, health, damage);
        }
    }
}
