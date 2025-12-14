import java.util.Scanner;
public class F11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    double length = scan.nextDouble();
		double breadth = scan.nextDouble();
		int rectangle = length * breadth;
		System.out.println("Area of rectangle: " + rectangle);
	}
}