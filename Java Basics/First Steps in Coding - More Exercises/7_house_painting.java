import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideX = Double.parseDouble(scanner.nextLine());
        double sideY = Double.parseDouble(scanner.nextLine());
        double sideH = Double.parseDouble(scanner.nextLine());

        double frontSide = sideX * sideX - 1.2 * 2;
        double backSide = sideX * sideX;
        double rightAndLeftSides = (sideX * sideY - 1.5 * 1.5) * 2;

        double roofFrontAndBack = sideX * sideH;
        double roofSides = sideX * sideY * 2;

        double areaWalls = frontSide + backSide + rightAndLeftSides;
        double areaRoof = roofFrontAndBack + roofSides;

        double paintWalls = areaWalls / 3.4;
        double paintRoof = areaRoof / 4.3;

        System.out.printf("%.2f%n", paintWalls);
        System.out.printf("%.2f", paintRoof);

    }
}
