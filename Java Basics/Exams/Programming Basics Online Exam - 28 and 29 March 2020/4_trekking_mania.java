import java.util.Scanner;

public class Trekking_Mania_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberGroups = Integer.parseInt(scanner.nextLine());

        double totalPeople = 0;
        int peopleMusala = 0;
        int peopleMonblan = 0;
        int peopleKiliman = 0;
        int peopleK2 = 0;
        int peopleEverest = 0;

        for (int a = 1; a <= numberGroups; a++) {
            int people = Integer.parseInt(scanner.nextLine());
            totalPeople += people;

            if (people <= 5) {
                peopleMusala += people;
            }
            if (people >= 6 && people <= 12) {
                peopleMonblan += people;
            }
            if (people >= 13 && people <= 25) {
                peopleKiliman += people;
            }
            if (people >= 26 && people <= 40) {
                peopleK2 += people;
            }
            if (people >= 41) {
                peopleEverest += people;
            }

        }

        System.out.printf("%.2f%%%n", (peopleMusala / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (peopleMonblan / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (peopleKiliman / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (peopleK2 / totalPeople) * 100);
        System.out.printf("%.2f%%", (peopleEverest / totalPeople) * 100);
    }
}