import java.util.Scanner;

public class Hospital02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int periodDays = Integer.parseInt(scanner.nextLine());

        int patientsTreated = 0;
        int patientsUntreated = 0;
        int doctors = 7;

        for (int i = 1; i <= periodDays ; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (patientsTreated < patientsUntreated) {
                    doctors++;
                }
            }
            if (patients <= 7) {
                patientsTreated += patients;
            } else {
                patientsTreated += doctors;
                patientsUntreated += patients - doctors;
            }


        }
        System.out.printf("Treated patients: %d.%n", patientsTreated);
        System.out.printf("Untreated patients: %d.", patientsUntreated);


    }
}
