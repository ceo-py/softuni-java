import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    float w = scanner.nextFloat();
    float h = scanner.nextFloat();

    int chairH = 70;
    int chairW = 120;

    float totalW = w * 100;
    float totalH = h * 100;

    float freeRowH = totalH - 100;
    float chairRowH = (int) freeRowH / chairH;

    float chairRowW = (int) totalW / chairW;

    int allChairs = (int) ((chairRowH * chairRowW) - 3);

    System.out.println(allChairs);
  }
}
