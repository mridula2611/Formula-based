import java.util.Scanner;
public class F3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fahrenheit : " );
        double F = scan.nextDouble();
        double celsius = (5.0/9.0)*(F-32);
        System.out.println("Enter Celsius");
        double C = scan.nextDouble();
        double Fahrenheit = (9.0 / 5.0)*C + 32;
        System.out.println(celsius);
        System.out.println(Fahrenheit);
    }
}