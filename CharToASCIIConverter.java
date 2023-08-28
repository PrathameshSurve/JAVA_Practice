import java.util.Scanner;

public class CharToASCIIConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);  // Read a single character

        int asciiValue = (int) inputChar;  // Cast the character to an integer to get its ASCII value

        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);

        scanner.close();
    }
}
