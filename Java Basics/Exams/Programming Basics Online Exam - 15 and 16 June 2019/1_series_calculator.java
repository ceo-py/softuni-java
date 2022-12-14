import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seriesCount = Integer.parseInt(scanner.nextLine());
        int episodesPerSeries = Integer.parseInt(scanner.nextLine());
        double minutesEpisode = Double.parseDouble(scanner.nextLine());


        double totalTime = (seriesCount * episodesPerSeries * minutesEpisode) * 1.2 + seriesCount * 10;


        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, totalTime);
    }
}
