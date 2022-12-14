import java.util.Scanner;

public class Gymnastics03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String aparatus = scanner.nextLine();

        double totalScore = 0;

        switch (aparatus) {
            case "ribbon":
                switch (country) {
                    case "Russia":
                        totalScore += 18.500;
                        break;
                    case "Bulgaria":
                        totalScore += 19.000;
                        break;
                    case "Italy":
                        totalScore += 18.700;
                        break;
                }
                break;
            case "hoop":
                switch (country) {
                    case "Russia":
                        totalScore += 19.100;
                        break;
                    case "Bulgaria":
                        totalScore += 19.300;
                        break;
                    case "Italy":
                        totalScore += 18.800;
                        break;
                }
                break;
            case "rope":
                switch (country) {
                    case "Russia":
                        totalScore += 18.600;
                        break;
                    case "Bulgaria":
                        totalScore += 18.900;
                        break;
                    case "Italy":
                        totalScore += 18.850;
                        break;
                }
                break;
        }
        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, aparatus);
        System.out.printf("%.2f%%", (1 - totalScore / 20) * 100);
    }
}
