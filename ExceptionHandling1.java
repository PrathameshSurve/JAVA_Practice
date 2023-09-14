
public class ExceptionHandling1 {
    public static void main(String[] args) {
        int a = 10, b = 0, c = 0;
        System.out.println("Start of program");
        try {
            c = a / b;
        } catch (Exception ae) {
            System.out.println(ae.getMessage() + "   <==This is your exception handling message.");
        }
        System.out.println("C=" + c);
        System.out.println("End of program");
    }
}