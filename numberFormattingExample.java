import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class numberFormattingExample {
    public static void main(String[] args) {
        // Create DecimalFormatSymbols for the default locale
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);

        // Print various locale-specific number symbols
        System.out.println("Grouping Separator (thousands): " + dfs.getGroupingSeparator()); // Example: ","
        System.out.println("Decimal Separator: " + dfs.getDecimalSeparator()); // Example: "."
        System.out.println("NaN Symbol: " + dfs.getNaN()); // Example: "NaN"
        System.out.println("Infinity Symbol: " + dfs.getInfinity()); // Example: "∞"

        // Define a DecimalFormat with custom formatting
        DecimalFormat df = new DecimalFormat("#,##0.00", dfs);
        df.setPositivePrefix("+"); // Positive numbers start with "+"
        df.setPositiveSuffix(" USD"); // Positive numbers end with " USD"
        df.setNegativePrefix("("); // Negative numbers start with "("
        df.setNegativeSuffix(" USD)"); // Negative numbers end with " USD)"

        // Format positive and negative numbers
        double positiveNumber = 12345.678;
        double negativeNumber = -12345.678;

        System.out.println("Formatted Positive Number: " + df.format(positiveNumber)); // Example: "+12,345.68 USD"
        System.out.println("Formatted Negative Number: " + df.format(negativeNumber)); // Example: "(12,345.68 USD)"

        // Demonstrating NaN and Infinity
        double nanValue = Double.NaN;
        double infinityValue = Double.POSITIVE_INFINITY;

        System.out.println("NaN Formatted: " + df.format(nanValue)); // Example: "NaN"
        System.out.println("Infinity Formatted: " + df.format(infinityValue)); // Example: "∞"
    }
}
