import java.util.Scanner;

public class Moving07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height;
        String action = scanner.nextLine();

        while (!action.equals("Done")) {
            int box = Integer.parseInt(action);

            volume -= box;

            if (volume <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
                break;
            }
            action = scanner.nextLine();
        }
        if (action.equals("Done")) {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}
