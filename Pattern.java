import java.util.*;

class Pattern {
    public static void main(String[] args) {

        System.out.print("Enter number of stars :\n");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        num.close();
        System.out.println("Here is your pattern:");
        
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(i);
            }

            System.out.println();
        }
    

    }
}