import java.util.Scanner;

public class Switchi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        sc.close();

        switch (button) {
            case 1:
                System.out.println("true");
                break;

            case 2:
                System.out.println("false");
                break;

            default:
                System.out.println("Invalid");
                break;
        }

    }

}
