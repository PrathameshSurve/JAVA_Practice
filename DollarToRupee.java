import java.util.Scanner;

public class DollarToRupee {
    public static void main(String[] args) {
        Scanner dollr = new Scanner(System.in);

        System.out.print("Enter amount in dollars: ");
        double dollars = dollr.nextDouble();

        double conversionRate = 82.66; // 1 US Dollar = 82.66 INR

        double rupees = dollars * conversionRate;

        System.out.println(dollars + " USD is approximately " + rupees + " INR");

        dollr.close();
    }
}
