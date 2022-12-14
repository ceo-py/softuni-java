import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();

        String alphabetStringLow = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetListLower = alphabetStringLow.toCharArray();
        char[] lLetters = new char[l];

        for (int i = 0; i < l; i++) {
            lLetters[i] = alphabetListLower[i];
        }

        for (int nOne = 1; nOne < n; nOne++) {
            for (int nNum = 1; nNum < n + 2; nNum++) {
                for (char l1 : lLetters) {
                    for (char lNum : lLetters) {
                        for (int check = 1; check < n + 3; check++) {
                            if (nOne < check && check > nNum && check <= n) {
                                System.out.print(nOne + "" + nNum + l1 + lNum + check + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
