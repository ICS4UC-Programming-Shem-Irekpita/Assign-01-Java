import java.util.Scanner;

/**
 * This checks to see if decimal matches.
 *
 * @author  Shem Irekpita
 * @version 1.0
 * @since   2026-04-10
 */
public final class NumberMatch {

    /**
     * Private constructor to satisfy Checkstyle utility class rule.
     */
    private NumberMatch() {
        // Prevent instantiation
    }

    /**
     * The main entry point for the application.
     *
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first decimal number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter your second decimal number: ");
        double num2 = scanner.nextDouble();

        // Round both decimals to 3 decimal places
        double round1 = Math.round(num1 * 1000.0) / 1000.0;
        double round2 = Math.round(num2 * 1000.0) / 1000.0;

        // Check for positive input first
        if (round1 <= 0 || round2 <= 0) {
            System.out.println("Please enter a positive input");
        } else {
            // Print formatted output using printf
            System.out.printf("Number 1: %.3f%n", round1);
            System.out.printf("Number 2: %.3f%n", round2);

            // Compare rounded values
            if (round1 == round2) {
                System.out.println("Match");
            } else {
                System.out.println("No Match");
            }
        }

        scanner.close();
    }
}
