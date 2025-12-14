import java.util.Scanner;
public class F14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    double radius = scan.nextDouble();
		double circle = 3.14159f * radius * radius;
		System.out.println("area of circle: " + circle);
	}
}