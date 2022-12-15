import java.util.Scanner;

public class PadawanEquipment10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalCost = (Math.ceil(studentCount * 1.1)) * lightsaberPrice + robePrice * studentCount + beltPrice * studentCount;
        int count = studentCount / 6;
        if (count != 0) {
            totalCost -= count * beltPrice;
        }
        if (budget >= totalCost) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalCost - budget);
        }
    }
}
