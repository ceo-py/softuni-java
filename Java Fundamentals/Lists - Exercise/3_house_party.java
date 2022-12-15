import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandNumber = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 1; i <= commandNumber; i++) {
            String[] input = scanner.nextLine().split(" ");

            switch (input.length) {
                case 3:
                    if (guests.size() == 0) {
                        guests.add(input[0]);
                    } else {
                        boolean isNotList = true;
                        for (int j = 0; j < guests.size(); j++) {
                            if (input[0].equals(guests.get(j))) {
                                isNotList = false;
                                System.out.printf("%s is already in the list!%n", input[0]);
                                break;
                            }
                        }
                        if (isNotList) {
                            guests.add(input[0]);
                        }
                    }
                    break;
                case 4:
                    boolean isInList = false;
                    for (int j = 0; j < guests.size(); j++) {
                        if (input[0].equals(guests.get(j))) {
                            guests.remove(input[0]);
                            isInList = true;
                        }
                    }

                    if (!isInList) {
                        System.out.printf("%s is not in the list!%n", input[0]);
                    }
                    break;
            }
        }
        for (String name : guests) {
            System.out.println(name);
        }
    }
}
