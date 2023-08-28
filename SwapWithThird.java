import java.util.*;
public class SwapWithThird {
    public static void main(String[] args) {
	Scanner number =new Scanner(System.in);

        System.out.print("Enetr Two Numbers:\nA=");
	int A= number.nextInt();
	System.out.print("B=");
	int B= number.nextInt();
	int temp;

	temp = A;
	A= B;
	B= temp;
	System.out.println("Numbers After Swapping:\nA=" + A + "\nB=" + B);


    }
}