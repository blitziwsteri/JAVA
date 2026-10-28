package lesson1;
import java.util.Scanner;

public class z10 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        
    int a = scan.nextInt();
    System.out.print(a%2==0?"Число четное":"Число нечетное");
    }
}
