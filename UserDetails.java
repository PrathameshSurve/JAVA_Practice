import java.util.*;

class UserDetails {
        public static void main(String[] args) {

                Scanner user = new Scanner(System.in);
                System.out.print("Enter your firstname: ");
                String firstname = user.nextLine();
                System.out.print("Enter your lastname: ");
                String lastname = user.nextLine();
                System.out.print("Enter age: ");
                int age = user.nextInt();

                System.out.println("\nHello " + lastname + " " + firstname + ". Your age is " + age + ".");
                user.close();

        }
}