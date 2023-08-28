import java.util.*;
public class MathOps {
    public static void main(String[] args) {
        System.out.println("Enetr Two numbers:");
	Scanner number = new Scanner(System.in);
	int a= number.nextInt();
	int b= number.nextInt();
	int add=a+b;
	int sub=a-b;
	int mul=a*b;
	double div=a/b;

	System.out.println("Additon=" + add + "\nSubstraction=" + sub + "\nMultiplication=" + mul + "\nDivision=" + div);
    }
}