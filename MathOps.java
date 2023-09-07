import java.util.*;

public class MathOps {
	public static void main(String[] args) {
		System.out.println("Enetr Two numbers:");
		Scanner number = new Scanner(System.in);
		float a = number.nextFloat();
		float b = number.nextFloat();
		float add = a + b;
		float sub = a - b;
		float mul = a * b;
		float div = a / b;

		System.out
				.println("Additon=" + add + "\nSubstraction=" + sub + "\nMultiplication=" + mul + "\nDivision=" + div);
		number.close();
	}
}