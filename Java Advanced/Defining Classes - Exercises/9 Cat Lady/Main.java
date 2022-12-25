import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Cat> catsInfo = new HashMap<>();
        String input;

        while (!"End".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+");
            String breed = data[0];
            String name = data[1];
            String characteristic = data[2];

            switch (breed) {
                case "Siamese":
                    catsInfo.put(name, new Siamese(name, breed, Double.parseDouble(characteristic)));
                    break;
                case "StreetExtraordinaire":
                    catsInfo.put(name, new StreetExtraordinaire(name, breed, Double.parseDouble(characteristic)));
                    break;
                case "Cymric":
                    catsInfo.put(name, new Cymric(name, breed, Double.parseDouble(characteristic)));
                    break;
            }
        }
        System.out.println(catsInfo.get(scanner.nextLine()));
    }
}