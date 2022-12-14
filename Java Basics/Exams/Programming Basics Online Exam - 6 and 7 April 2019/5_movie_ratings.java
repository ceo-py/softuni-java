import java.util.Scanner;

public class MovieRatings05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberMovies = Integer.parseInt(scanner.nextLine());
        double sumRatings = 0;
        String movieHighRank = "";
        String movieLowRank = "";

        double maxRating = Integer.MIN_VALUE;
        double minRating = Integer.MAX_VALUE;

        for (int i = 1; i <= numberMovies; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sumRatings += rating;

            if (rating >= maxRating) {
                maxRating = rating;
                movieHighRank = movieName;
            }

            if (rating <= minRating) {
                minRating = rating;
                movieLowRank = movieName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", movieHighRank, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", movieLowRank, minRating);
        System.out.printf("Average rating: %.1f", sumRatings / numberMovies);
    }
}
