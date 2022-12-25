public class Engine {
    private String engineModel;
    private int power;
    // optional
    private int displacement;
    private String efficiency;

    // Constructors with more arguments call those with fewer
    public Engine(String engineModel, int power) {
        this.engineModel = engineModel;
        this.power = power;
        this.displacement = -1; // invalid value
        this.efficiency = "n/a";
    }

    public Engine(String engineModel, int power, int displacement) {
        this(engineModel, power);
        this.displacement = displacement;
    }

    public Engine(String engineModel, int power, String efficiency) {
        this(engineModel, power);
        this.efficiency = efficiency;
    }

    public Engine(String engineModel, int power, int displacement, String efficiency) {
        this(engineModel, power, displacement);
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        String displacement = this.displacement == -1 ? "n/a" : String.valueOf(this.displacement);

        return String.format("%s:%n" + "Power: %d%n" + "Displacement: %s%n" + "Efficiency: %s",
                this.engineModel, this.power, displacement, this.efficiency);
    }
}