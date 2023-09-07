import java.util.*;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

		System.out.print("Enetr the radius of circle=");
		int radius = number.nextInt();
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Area of circle is:" + area);
		number.close();

	}
}