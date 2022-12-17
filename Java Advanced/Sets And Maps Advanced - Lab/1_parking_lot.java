import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        Set<String> parkingSet = new HashSet<>();

        while (!input.equals("END")) {
            String[] currentCommand = input.split(", ");
            switch (currentCommand[0]) {
                case "IN":
                    parkingSet.add(currentCommand[1]);
                    break;
                case "OUT":
                    parkingSet.remove(currentCommand[1]);
                    break;
                default:
                    break;
            }

            input = bufferedReader.readLine();
        }

        if (parkingSet.isEmpty()) {
            System.out.println("Parking Lot is Empty");
            return;
        }

        for (String license : parkingSet) {
            System.out.println(license);
        }
    }
}