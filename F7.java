import java.util.Scanner;
public class F7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double SA = 6 * Math.pow(a,2);
        double V = Math.pow(a,3);
        double P = 12 * a;
        System.out.println(SA);
        System.out.println(V);
        System.out.println(P);
    }
}