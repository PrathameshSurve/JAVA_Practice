
import java.util.*;

public class GuessRandomNumber {

    public static void main(String[] args) {
        System.out.println("System has randomly created a number between 1 to  100.");
        System.out.println("Please, Guess the number, You have only 10 attempts : ");
        Scanner num = new Scanner(System.in);
        int min = 1; // Minimum value of the range
        int max = 100; // Maximum value of the range
        int sysnum = (int) (Math.random() * (max - min + 1)) + min;
        int number = num.nextInt();

        for (int i = 1; i < 10; i++) {
            if (number == sysnum) {
                System.out.println("GOOD ONE! Your guess is correct.");
                break;
            } else if (number > 100 || number < 1) {
                System.out.println("You entered a wrong input. Please enter number between 1 to 100.");
            } else if (number < sysnum) {
                System.out.println("You guess a small small one.");
            } else {
                System.out.println("You guess a big one.");
            }

            if (i < 10) {
                System.out.println("You have " + (10 - i) + " attempts remaining.");
            } else {
                System.out.println("\nYou've used all your attempts.");
                System.out.println("The correct number was: " + sysnum);
            }

            number = num.nextInt();
        }
        num.close();
        System.out.println("Thanks for playing!");

    }

}