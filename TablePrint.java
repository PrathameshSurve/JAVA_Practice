import java.util.*;

public class TablePrint {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner num = new Scanner(System.in);

        int number = num.nextInt();
        num.close();
        System.out.println("Your Table is :");
        for (int i = 1; i <= 10; i++) {
            int prod = number * i;
            System.out.println(number + "*" + i + "=" + prod);

        }

    }

}
