import java.util.Scanner;

public class DollarToRupee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in dollars: ");
        double dollars = scanner.nextDouble();

        double conversionRate = 82.66; // 1 US Dollar = 82.66 INR

        double rupees = dollars * conversionRate;

        System.out.println(dollars + " USD is approximately " + rupees + " INR");

        scanner.close();
    }
}
