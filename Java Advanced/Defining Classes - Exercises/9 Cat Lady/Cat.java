public class Cat {
    private final String name;
    private final String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.breed, this.name);
    }
}