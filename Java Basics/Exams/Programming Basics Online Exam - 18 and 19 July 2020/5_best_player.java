import java.util.Scanner;

public class BestPlayer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();


        String winner = "";
        boolean isHatTrick = false;
        int maxGoals = Integer.MIN_VALUE;

        while (!name.equals("END")) {
            int goals = Integer.parseInt(sc.nextLine());

            if (goals > maxGoals) {
                maxGoals = goals;
                winner = name;
            }

            if (goals >= 3) {
                isHatTrick = true;
            }
            if (goals >= 10) {
                winner = name;
                maxGoals = goals;
                isHatTrick = true;
                break;
            }
            name = sc.nextLine();
        }

        System.out.printf("%s is the best player!%n", winner);

        if (isHatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
