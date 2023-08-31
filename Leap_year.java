
//Write a Java programme to print whether a year is a leap year or not.
import java.util.*;

class Leap_year {
    public static void main(String[] args) {

        System.out.print("Enter year :\n");
        Scanner year = new Scanner(System.in);
        int check = year.nextInt();
        year.close();
        if (check % 4 == 0) {
            System.out.println("This is Leap Year.");

        } else {
            System.out.println("This is Not a Leap Year.");
        }

    }
}
