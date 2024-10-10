import java.util.Scanner;

public class TimeFunctions {

    // 1. seconds_difference
    public static double secondsDifference(double time1, double time2) {
        return time2 - time1;
    }

    // Main method to run and test the secondsDifference method with user input
    public static void main(String[] args) {
        // Create a Scanner object to read input from the terminal
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first time (time1)
        System.out.print("Enter the first time in seconds (time1): ");
        double time1 = scanner.nextDouble();  // Read input as a double

        // Prompt user for the second time (time2)
        System.out.print("Enter the second time in seconds (time2): ");
        double time2 = scanner.nextDouble();  // Read input as a double

        // Call the secondsDifference function with the input values
        double result = secondsDifference(time1, time2);

        // Output the result
        System.out.println("The difference in seconds: " + result);
    }
}
