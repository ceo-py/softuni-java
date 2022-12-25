import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            Person person = new Person(name);
            people.putIfAbsent(name, person);

            switch (tokens[1]) {
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    Company company = new Company(companyName, department, salary);
                    people.get(name).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    List<Pokemon> pokemons = people.get(name).getPokemons();
                    pokemons.add(pokemon);
                    people.get(name).setPokemons(pokemons);
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];
                    Parent parent = new Parent(parentName, parentBirthday);
                    List<Parent> parents = people.get(name).getParents();
                    parents.add(parent);
                    people.get(name).setParents(parents);
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthday = tokens[3];
                    Child child = new Child(childName, childBirthday);
                    List<Child> children = people.get(name).getChildren();
                    children.add(child);
                    people.get(name).setChildren(children);
                    break;
                case "car":
                    String carModel = tokens[2];
                    int carSpeed = Integer.parseInt(tokens[3]);
                    Car car = new Car(carModel, carSpeed);
                    people.get(name).setCar(car);
                    break;
            }
            input = scanner.nextLine();
        }

        String targetName = scanner.nextLine();

        for (Person person : people.values()) {
            if (person.getName().equals(targetName)) {
                System.out.print(person.toString());
            }
        }
    }
}