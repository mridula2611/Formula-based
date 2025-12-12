import java.util.Scanner;
public class F10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double h = scan.nextDouble();
        double CSA = 2 * Math.PI * r * h;
        double TSA = 2 * Math.PI * r * ( r + h );
        double v = Math.PI * r * r * h;
        System.out.println(CSA);
        System.out.println(TSA);
        System.out.println(v);
    }
}