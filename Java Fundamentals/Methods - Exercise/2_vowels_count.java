import javax.print.DocFlavor;
import java.util.Scanner;

public class VowelsCount02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println(stringVowelCount(text));
    }

    public static int stringVowelCount(String text) {

        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {

            switch (text.charAt(i)) {
                case 'a':
                    vowelCount++;
                    break;
                case 'o':
                    vowelCount++;
                    break;
                case 'e':
                    vowelCount++;
                    break;
                case 'i':
                    vowelCount++;
                    break;
                case 'u':
                    vowelCount++;
                    break;
                case 'A':
                    vowelCount++;
                    break;
                case 'E':
                    vowelCount++;
                    break;
                case 'O':
                    vowelCount++;
                    break;
                case 'I':
                    vowelCount++;
                    break;
                case 'U':
                    vowelCount++;
                    break;
            }
        }
        return vowelCount;
    }
}
