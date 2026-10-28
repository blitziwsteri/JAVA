package lesson1;
import java.util.Scanner;

public class z2 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    int max;

    if(a==b) System.out.println("Числа равны");

    else if (a>b) System.out.println(a + " больше " + b);

    else System.out.println(b + " больше " + a);

    }
}
