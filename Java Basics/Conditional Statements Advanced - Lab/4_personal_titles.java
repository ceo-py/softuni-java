# Import the Scanner class from the java.util package
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    # Create a new Scanner object to read input from the user
    Scanner in = new Scanner(System.in);

    # Read the user's age as a float
    float age = in.nextFloat();

    # Read the user's gender as a string
    String gender = in.next();

    # Check if the user's gender is male
    if (gender.equals("m")) {
      # Check if the user's age is greater than or equal to 16
      if (age >= 16) {
        # Print "Mr." if the user is a male over the age of 16
        System.out.println("Mr.");
      } else if (age < 16) {
        # Print "Master" if the user is a male under the age of 16
        System.out.println("Master");
      }
    } else if (gender.equals("f")) {
      # Check if the user's age is greater than or equal to 16
      if (age >= 16) {
        # Print "Ms." if the user is a female over the age of 16
        System.out.println("Ms.");
      } else if (age < 16) {
        # Print "Miss" if the user is a female under the age of 16
        System.out.println("Miss");
      }
    }
  }
}
