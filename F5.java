import java.util.Scanner;
public class F5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int breadth = scan.nextInt();
        int rectangle = 2 * (len + breadth);
        System.out.println(rectangle);
    }
}