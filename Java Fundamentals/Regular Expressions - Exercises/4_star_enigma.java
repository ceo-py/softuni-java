import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLines = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planetName>[A-Za-z]+)(([^\\,\\!\\:\\>\\-])*):(?<population>\\d+)(([^\\,\\!\\:\\>\\-])*)!(?<type>[AD])!(([^\\,\\!\\:\\>\\-])*)->(?<soldiers>\\d+)";
        Map <String, String> planetsMap = new TreeMap<>();

        for (int i = 1; i <= numberLines; i++) {
            String encryptedMessage = scanner.nextLine();
            int count = 0;

            for (char c : encryptedMessage.toCharArray()) {
                switch (c) {
                    case 's':
                    case 't':
                    case 'a':
                    case 'r':
                    case 'S':
                    case 'T':
                    case 'A':
                    case 'R':
                        count++;
                        break;
                    default:
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < encryptedMessage.length() ; j++) {
                char current = encryptedMessage.charAt(j);
                sb.append ((char) (current - count));
            }
            String decryptedMessage = sb.toString();
             Pattern pattern = Pattern.compile(regex);
             Matcher matcher = pattern.matcher(decryptedMessage);
             String planetName = "";
             String planetType = "";
             String population = "";
             String soldiers = "";
             while (matcher.find()) {
                 planetName = matcher.group("planetName");
                 planetType = matcher.group("type");
                 population = matcher.group("population");
                 soldiers = matcher.group("soldiers");
             }

             if (planetName.length() > 0 && planetType.length() > 0 && population.length() > 0 && soldiers.length() > 0) {
                 planetsMap.put(planetName, planetType);
             }

        }
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (Map.Entry <String, String> entry : planetsMap.entrySet()) {
            if (entry.getValue().equals("A")) {
                attackedPlanets.add(entry.getKey());
            } else {
                destroyedPlanets.add(entry.getKey());
            }
        }

        StringBuilder attackedPlanetsOutput = new StringBuilder();
        StringBuilder destroyedPlanetsOutput = new StringBuilder();

        attackedPlanetsOutput.append("Attacked planets: ").append(attackedPlanets.size()).append("\n");
        if (attackedPlanets.size() > 0) {
            for (String planet : attackedPlanets) {
                attackedPlanetsOutput.append("-> ").append(planet).append("\n");
            }
        }
        destroyedPlanetsOutput.append("Destroyed planets: ").append(destroyedPlanets.size()).append("\n");
        if (destroyedPlanets.size()> 0) {
            for (String planet : destroyedPlanets) {
                destroyedPlanetsOutput.append("-> ").append(planet).append("\n");
            }
        }
        System.out.print(attackedPlanetsOutput);
        System.out.print(destroyedPlanetsOutput);
    }
}
