import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int requiredHeight = in.nextInt();
        int initialHeight = requiredHeight - 30;
        int failedJumps = 0;
        int failedHeight = 0;
        boolean failFlag = false;
        int jumpsNumber = 0;

        while (failedJumps < 3) {
            int jumpHeight = in.nextInt();
            if (jumpHeight > initialHeight) {
                initialHeight += 5;
                failedJumps = 0;
                jumpsNumber += 1;
            } else if (jumpHeight <= initialHeight) {
                failedJumps += 1;
                jumpsNumber += 1;
            }
            if (failedJumps == 3) {
                failFlag = true;
            }
            if (initialHeight > requiredHeight) {
                break;
            }
        }

        if (failFlag) {
            System.out.println("Tihomir failed at " + initialHeight + "cm after " + jumpsNumber + " jumps.");
        }
        if (!failFlag) {
            System.out.println("Tihomir succeeded, he jumped over " + requiredHeight + "cm after " + jumpsNumber + " jumps.");
        }
    }
}
