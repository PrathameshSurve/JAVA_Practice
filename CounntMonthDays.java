import java.util.Scanner;

public class CounntMonthDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        int daysInMonth = getDaysInMonth(month, year);

        if (daysInMonth != -1) {
            System.out.println("Number of days in the entered month: " + daysInMonth);
        } else {
            System.out.println("Invalid month entered.");
        }

        scanner.close();
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1; // For invalid month
        }

        int days;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; // For leap year
                } else {
                    days = 28;
                }
                break;
            default:
                days = 31;
                break;
        }

        return days;
    }
}
