import java.util.Scanner;

public class NumberToWords {
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-9999): ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 1 || number > 9999) {
            System.out.println("Number out of range (1-9999)");
            return;
        }

        String result = convertToWords(number);
        System.out.println("Output as words: " + result);
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 10) {
            return units[number];
        }

        if (number < 20) {
            return teens[number - 10];
        }

        if (number < 100) {
            return tens[number / 10] + (number % 10 != 0 ? " " + units[number % 10] : "");
        }

        if (number < 1000) {
            return units[number / 100] + " Hundred" + (number % 100 != 0 ? " and " + convertToWords(number % 100) : "");
        }

        return units[number / 1000] + " Thousand" + (number % 1000 != 0 ? " " + convertToWords(number % 1000) : "");
    }
}
