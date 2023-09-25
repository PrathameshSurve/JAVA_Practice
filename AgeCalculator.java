import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class AgeCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter your Birthday(Press Enter), Birthmonth(Press Enter)& Birthyear: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        LocalDate date = LocalDate.now();
        int d;
        for (int i = 0; i<=2; i++){
           d= sc.nextInt();
           list1.add(d);
        }
        int year= date.getYear()-list1.get(2);
        int month= date.getMonthValue()-list1.get(1);
        int day= date.getDayOfMonth()-list1.get(0);
       
        System.out.println("Your age is: " + year + " Years " + month +" Months " + day +" Days" );
        sc.close();
    }
}
