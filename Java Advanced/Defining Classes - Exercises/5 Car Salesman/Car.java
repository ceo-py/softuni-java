public class Car {
    private String carModel;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String carModel, Engine engine) {
        this.carModel = carModel;
        this.engine = engine;
        this.weight = -1; // invalid value
        this.color = "n/a";
    }

    public Car(String carModel, Engine engine, int weight) {
        this(carModel, engine);
        this.weight = weight;
    }

    public Car(String carModel, Engine engine, String color) {
        this(carModel, engine);
        this.color = color;
    }

    public Car(String carModel, Engine engine, int weight, String color) {
        this(carModel, engine, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        String weight = this.weight == -1 ? "n/a" : String.valueOf(this.weight);

        StringBuilder sb = new StringBuilder(this.carModel + ":");
        sb.append(System.lineSeparator()).append(this.engine.toString()).append(System.lineSeparator())
                .append("Weight: ").append(weight).append(System.lineSeparator()).append("Color: ")
                .append(this.color);

        return sb.toString();
    }
}