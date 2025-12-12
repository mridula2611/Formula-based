import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double r = scan.nextDouble();   // radius

        double surfaceArea = 4 * Math.PI * r * r;
        double volume = (4.0/3.0) * Math.PI * r * r * r;

        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}
