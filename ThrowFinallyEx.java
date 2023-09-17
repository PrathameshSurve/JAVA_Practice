import java.util.*;

public class ThrowFinallyEx {
    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try {

            sc.close();
            if (name.equals("Pratham"))

                throw new Exception();

        } catch (Exception ae) {
            System.out.println(ae.getMessage());

            System.out.println("Please don't use my name.");
        } finally {
            System.out.println("You entered :" + name);

        }
        System.out.println("End of program");
    }
}