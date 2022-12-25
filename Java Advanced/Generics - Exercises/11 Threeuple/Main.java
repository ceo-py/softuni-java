import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String firstName = input[0];
        String secondName = input[1];
        String address = input[2];
        String town = input[3];
        Threeuple<String, String, String> tuple = new Threeuple<>(firstName + " " + secondName, address, town);
        System.out.println(tuple);

        input = scanner.nextLine().split(" ");
        String name = input[0];
        int beerLiters = Integer.parseInt(input[1]);
        boolean isDrunk = "drunk".equals(input[2]);
        Threeuple<String, Integer, Boolean> secondTuple = new Threeuple<>(name, beerLiters, isDrunk);
        System.out.println(secondTuple);

        input = scanner.nextLine().split(" ");
        name = input[0];
        double accountBalance = Double.parseDouble(input[1]);
        String bankName = input[2];

        Threeuple<String, Double, String> thirdTuple = new Threeuple<>(name, accountBalance, bankName);
        System.out.println(thirdTuple);
    }
}