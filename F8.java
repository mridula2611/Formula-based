import java.util.Scanner;
public class F8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double l = scan.nextDouble();
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        double SA = 2 * (l*b + b*h + h*l);
        double Volume = l * b * h;
        System.out.println(SA);
        System.out.println(Volume);
    }
}