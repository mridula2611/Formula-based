import java.util.Scanner;
public class F1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    double length = scan.nextDouble();
		double breadth = scan.nextDouble();
		double side = scan.nextDouble();
		double base = scan.nextDouble();
	    double height = scan.nextDouble();
	    double radius = scan.nextDouble();
		int rectangle = length * breadth;
		double square = side * side;
		double triangle = 0.5f * base * height;
		double circle = 3.14159f * radius * radius;
		System.out.println("Area of rectangle: " + rectangle);
		System.out.println("Area of Square: " + square);
        System.out.println("Area of triangle: " + triangle);
		System.out.println("area of circle: " + circle);
	}
}