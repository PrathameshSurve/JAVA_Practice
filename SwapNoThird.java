import java.util.*;

public class SwapNoThird {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

		System.out.print("Enetr Two Numbers:\nA=");
		int A = number.nextInt();
		System.out.print("B=");
		int B = number.nextInt();

		A = A + B;
		B = A - B;
		A = A - B;
		System.out.println("Numbers After Swapping:\nA=" + A + "\nB=" + B);
		number.close();

	}
}