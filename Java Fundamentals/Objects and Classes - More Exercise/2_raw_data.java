package Raw_Data_02;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<Car> carList = new LinkedHashSet<>();

        Car car;
        Engine engine;
        Cargo cargo;
        Tire tire1;
        Tire tire2;
        Tire tire3;
        Tire tire4;

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int speed = Integer.parseInt(input[1]);
            int power = Integer.parseInt(input[2]);

            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];

            double tire1p = Double.parseDouble(input[5]);
            int tire1a = Integer.parseInt(input[6]);
            double tire2p = Double.parseDouble(input[7]);
            int tire2a = Integer.parseInt(input[8]);
            double tire3p = Double.parseDouble(input[9]);
            int tire3a = Integer.parseInt(input[10]);
            double tire4p = Double.parseDouble(input[11]);
            int tire4a = Integer.parseInt(input[12]);

            engine = new Engine(speed, power);
            cargo = new Cargo(cargoWeight, cargoType);
            tire1 = new Tire(tire1p, tire1a);
            tire2 = new Tire(tire2p, tire2a);
            tire3 = new Tire(tire3p, tire3a);
            tire4 = new Tire(tire4p, tire4a);
            car = new Car(model, engine, cargo, tire1, tire2, tire3, tire4);
            carList.add(car);
        }

        String command = scanner.nextLine();
        ArrayList<String> output = new ArrayList<>();

        if (command.equals("fragile")) {
            carList.forEach(e -> {
                if (e.getCargo().getType().equals("fragile")) {
                    for (Tire tireSet : e.getTires()) {
                        if (tireSet.getPressure() < 1) {
                            output.add(e.getModel());
                            break;
                        }
                    }
                }
            });
        } else {
            carList.forEach(e -> {
                if (e.getCargo().getType().equals("flamable") && e.getEngine().getPower() > 250) {
                    output.add(e.getModel());
                }
            });
        }

        output.forEach(System.out::println);
    }
}


package Raw_Data_02;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tire1;
    private Tire tire2;
    private Tire tire3;
    private Tire tire4;

    public Car(String model, Engine engine, Cargo cargo, Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tire1 = tire1;
        this.tire2 = tire2;
        this.tire3 = tire3;
        this.tire4 = tire4;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tire[] getTires(){
        return new Tire[]{tire1, tire2, tire3, tire4};
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}

package Raw_Data_02;

public class Cargo {
    private int weight;
    private String type;

    public Cargo(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

package Raw_Data_02;

public class Engine {
    private int speed;
    private int power;

    public Engine(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}

package Raw_Data_02;

public class Tire {
    private double pressure;
    private int age;

    public Tire(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }
}