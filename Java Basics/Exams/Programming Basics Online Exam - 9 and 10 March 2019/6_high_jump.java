import java.util.Scanner;

public class HighJump06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetHeight = Integer.parseInt(scanner.nextLine());
        int jumpHeight = Integer.parseInt(scanner.nextLine());
        int initialHeight = targetHeight - 30;

        int unsuccessfulJumps = 0;

        int jumps = 0;
        boolean isReached = true;

        while (jumpHeight < targetHeight) {
            jumps++;
            while (jumpHeight <= initialHeight) {
                unsuccessfulJumps++;
                jumps++;
                if (unsuccessfulJumps == 3) {
                    isReached = false;
                    break;
                }
                jumpHeight = Integer.parseInt(scanner.nextLine());
            }
            if (!isReached) {
                break;
            }
            initialHeight +=5;
            unsuccessfulJumps = 0;
            jumpHeight = Integer.parseInt(scanner.nextLine());
        }

        if (isReached) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", targetHeight, jumps + 1);
        } else {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", initialHeight, jumps - 1);
        }
    }
}
