import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.print("Enter your name:\n");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name + "\nEnter your Full name :");
        Scanner ab = new Scanner(System.in);
        String fullname = ab.nextLine();
        System.out.println(fullname);

        sc.close();
        ab.close();
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.print("Sum of a and b is " + sum);

    }

}