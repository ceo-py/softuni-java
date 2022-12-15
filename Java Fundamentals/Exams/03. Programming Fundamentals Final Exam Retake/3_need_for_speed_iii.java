import java.util.*;

public class NeedForSpeedIII03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCars = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> carDataMap = new LinkedHashMap<>();

        for (int i = 1; i <= numberCars; i++) {
            String[] carData = scanner.nextLine().split("\\|");
            String car = carData[0];
            int mileage = Integer.parseInt(carData[1]);
            int fuel = Integer.parseInt(carData[2]);

            carDataMap.putIfAbsent(car, new ArrayList<>());
            carDataMap.get(car).add(mileage);
            carDataMap.get(car).add(fuel);
        }
        String commandLine = scanner.nextLine();

        while (!commandLine.equals("Stop")) {
            String[] commandData = commandLine.split(" : ");
            String command = commandData[0];
            String car = commandData[1];

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(commandData[2]);
                    int fuelForDistance = Integer.parseInt(commandData[3]);
                    if (fuelForDistance > carDataMap.get(car).get(1)) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int newMileage = carDataMap.get(car).get(0) + distance;
                        carDataMap.get(car).remove(0);
                        carDataMap.get(car).add(0, newMileage);


                        int newFuel = carDataMap.get(car).get(1) - fuelForDistance;
                        carDataMap.get(car).remove(1);
                        carDataMap.get(car).add(1, newFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuelForDistance);
                        if (carDataMap.get(car).get(0) >= 100000) {
                            System.out.printf("Time to sell the %s!%n", car);
                            carDataMap.remove(car);
                            break;
                        }
                    }
                    break;
                case "Refuel":
                    int refill = Integer.parseInt(commandData[2]);
                    if (refill + carDataMap.get(car).get(1) > 75) {
                        refill = 75 - carDataMap.get(car).get(1);
                    }
                    int newFuelAmount = carDataMap.get(car).get(1) + refill;
                    carDataMap.get(car).remove(1);
                    carDataMap.get(car).add(1, newFuelAmount);
                    System.out.printf("%s refueled with %d liters%n", car, refill);
                    break;
                case "Revert":
                    int kilometres = Integer.parseInt(commandData[2]);
                    int decreasedMileage = carDataMap.get(car).get(0) - kilometres;
                    carDataMap.get(car).remove(0);
                    carDataMap.get(car).add(0, decreasedMileage);
                    if (carDataMap.get(car).get(0) >= 10000) {
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometres);
                    } else {
                        carDataMap.get(car).remove(0);
                        carDataMap.get(car).add(0, 10000);
                    }
                    break;
                default:
                    break;

            }

            commandLine = scanner.nextLine();
        }

        carDataMap.forEach((k, v) -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", k, v.get(0), v.get(1)));
    }
}
