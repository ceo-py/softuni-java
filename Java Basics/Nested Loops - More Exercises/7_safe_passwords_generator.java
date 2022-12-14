import java.util.Scanner;

public class Safe_Passwords_Generator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        boolean flag = false;
        char firstLetter = 35;
        char secondLetter = 64;

        while (firstLetter < 55 && secondLetter < 96) {
            for(int thirdLetter = 1; thirdLetter <= a; thirdLetter++) {
                for (int fourthLetter = 1; fourthLetter <= b; fourthLetter++) {
                    System.out.printf("%c%c%d%d%c%c|", firstLetter, secondLetter, thirdLetter, fourthLetter, secondLetter,firstLetter);
                    firstLetter++;
                    secondLetter++;
                    combinations++;

                    if (combinations >= max) {
                        flag = true;
                        break;
                    }
                    if (a == thirdLetter && b == fourthLetter) {
                        flag = true;
                        break;
                    }
                    if (firstLetter > 55) {
                        firstLetter = 35;
                    }
                    if (secondLetter > 96) {
                        secondLetter = 64;
                    }
                }
                if(flag) {
                    break;
                }
            }
            if(flag) {
                break;
            }
        }

    }
}