import java.time.LocalDate;
import java.util.Date;


public class DateEx {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
       // System.out.println(date.getDate());// This is not a good practice.

        LocalDate date2 = LocalDate.now();
        System.out.println(date2);

  
        System.out.println(date2.getDayOfMonth()+"/" + date2.getMonthValue()+"/" + date2.getYear());


    }
}
