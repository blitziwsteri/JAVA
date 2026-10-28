package lesson1;
import java.util.Scanner;

public class z5 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        
    double a = scan.nextDouble();
    if(a<0) System.out.print("Число меньше нуля");
    else if(a==0) System.out.print("Число равно 0");
    else System.out.print("Число больше 0");
    }
}
