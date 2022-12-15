package Vehicle_Catalogue_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> vehicles = new ArrayList<>();

        while (!"End".equals(input)) {
            String[] command = input.split("\\s+");
            String type = command[0];
            String model = command[1];
            String color = command[2];
            int horsePower = Integer.parseInt(command[3]);

            Vehicle vehicle = new Vehicle();
            vehicle.setType(type);
            vehicle.setModel(model);
            vehicle.setColor(color);
            vehicle.setHorsePower(horsePower);
            vehicles.add(vehicle);

            input = scanner.nextLine();
        }

        String model = "";
        while (!"Close the Catalogue".equals(model = scanner.nextLine())) {
            String finalModel = model;
            vehicles
                    .stream()
                    .filter(v -> v.getModel().equals(finalModel))
                    .forEach(System.out::println);
        }

        System.out.println(String.format("Cars have average horsepower of: %.2f.", average(vehicles.stream()
                .filter(v -> v.getType().equals("car"))
                .collect(Collectors.toList()))));

        System.out.println(String.format("Trucks have average horsepower of: %.2f.", average(vehicles.stream()
                .filter(v -> v.getType().equals("truck"))
                .collect(Collectors.toList()))));

    }

    private static double average(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }
        double sum = 0;

        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getHorsePower();
        }
        return sum / vehicles.size();
    }

}

package Vehicle_Catalogue_06;

public class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s\n" +
                    "Model: %s\n" +
                    "Color: %s\n" +
                    "Horsepower: %d",
                                 getType().toUpperCase().charAt(0) + this.getType().substring(1),
                                 getModel(), getColor(),
                                 getHorsePower());
        }

}