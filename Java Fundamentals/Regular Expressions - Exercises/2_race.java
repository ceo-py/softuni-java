import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexName = "[a-zA-Z]";
        String regexNumbers = "[0-9]";
        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        Map<String, Integer> pointsMap = new LinkedHashMap<>();

        while (!input.equals("end of race")) {
            Pattern patternName = Pattern.compile(regexName);
            Matcher matcherName = patternName.matcher(input);
            StringBuilder nameBuilder = new StringBuilder();
            int distance = 0;

            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }

            Pattern patternDigits = Pattern.compile(regexNumbers);
            Matcher matcherDigits = patternDigits.matcher(input);

            while (matcherDigits.find()) {
               distance += Integer.parseInt(matcherDigits.group());
            }
            String participantName = String.valueOf(nameBuilder);

            if (participants.contains(participantName)) {
                pointsMap.putIfAbsent(participantName, 0);
                pointsMap.put(participantName, pointsMap.get(participantName) + distance);
            }

            input = scanner.nextLine();
        }

        List<String> firstThreeNames = pointsMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.printf("1st place: %s%n", firstThreeNames.get(0));
        System.out.printf("2nd place: %s%n", firstThreeNames.get(1));
        System.out.printf("3rd place: %s%n", firstThreeNames.get(2));
    }
}
