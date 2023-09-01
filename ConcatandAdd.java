import java.util.*;

public class ConcatandAdd {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        num.close();

        System.out.println("Your Sum is:");
        int sum = 0;
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println(sum);

    }

}
