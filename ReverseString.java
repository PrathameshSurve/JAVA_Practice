
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String og = "RevereseThis";
        System.out.println("This is a original string : " + og);

        StringBuilder reversed = new StringBuilder(og).reverse();

        String result = reversed.toString();

        System.out.println("This is a reverse string : " + result);

        scanner.close();
    }

}
