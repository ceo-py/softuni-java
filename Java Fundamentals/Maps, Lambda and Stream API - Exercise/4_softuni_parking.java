import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> driverToPlateNumberMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split(" ");

            switch (command[0]) {
                case "register":
                    String name = command[1];
                    if (driverToPlateNumberMap.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", driverToPlateNumberMap.get(name));
                        break;
                    }
                    String licencePlateNumber = command[2];
                    driverToPlateNumberMap.put(name, licencePlateNumber);
                    System.out.printf("%s registered %s successfully%n", name, licencePlateNumber);
                    break;
                case "unregister":
                    String unregisteredName = command[1];
                    if (!driverToPlateNumberMap.containsKey(unregisteredName)) {
                        System.out.printf("ERROR: user %s not found%n", unregisteredName);
                        break;
                    }
                    driverToPlateNumberMap.remove(unregisteredName);
                    System.out.printf("%s unregistered successfully%n", unregisteredName);
                    break;
                default:
                    break;
            }

        }
        driverToPlateNumberMap.forEach((name, licencePlateNumber) -> System.out.printf("%s => %s%n", name, licencePlateNumber));
    }
}
