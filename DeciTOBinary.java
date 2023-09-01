
import java.util.*;

public class DeciTOBinary {
    public static void main(String[] args) {
        System.out.println("Enter any Decimal Number number: ");
        Scanner num = new Scanner(System.in);
        int decimalNumber = num.nextInt();
        num.close();

        System.out.println("Your Binary Number is:");

        if (decimalNumber == 0) {
            System.out.println(0);
        }

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            int binary = remainder;
            System.out.print(binary);
            decimalNumber /= 2;
        }

    }

}