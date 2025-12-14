import java.util.Scanner;
public class F13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double base = scan.nextDouble();
	    double height = scan.nextDouble();
		double triangle = 0.5f * base * height;
        System.out.println("Area of triangle: " + triangle);
	}
}