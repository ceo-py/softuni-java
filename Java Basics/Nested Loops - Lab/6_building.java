import java.util.Scanner;

public class Building06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int roomPerFloor = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i >= 1 ; i--) {
            for (int j = 0; j < roomPerFloor ; j++) {
                if (i == floors ) {
                    System.out.print("L"+ i + j + " ");
                    if (j == roomPerFloor - 1) {
                        System.out.printf("%n");
                        continue;
                    }
                }

                if (i % 2 == 0 && i != floors) {
                    System.out.print("O" + i + j + " ");
                    if (j == roomPerFloor - 1) {
                        System.out.printf("%n");
                    }
                } else if (i % 2 != 0 && i != floors){
                    System.out.print("A" + i + j + " ");
                    if (j == roomPerFloor - 1) {
                        System.out.printf("%n");
                    }
                }

            }
        }
    }
}
