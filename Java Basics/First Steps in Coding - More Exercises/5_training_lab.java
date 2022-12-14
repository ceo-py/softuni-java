import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double placesByLength = length / 1.2;
        int placesByLengthRounded = (int)placesByLength; // double -> int - TypeCasting
        double widthAdjusted = width - 1;
        double placesByWidth = widthAdjusted / 0.7;
        int placesByWidthRounded = (int)Math.round(placesByWidth); //double -> int Math.round method
        int placesByWidthAndLength = placesByLengthRounded * placesByWidthRounded;
        int totalPlaces = placesByWidthAndLength - 3;
        System.out.printf("%d", totalPlaces);

    }
}
