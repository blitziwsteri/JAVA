package lesson1;
import java.util.Scanner;

public class z12 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    String symbol = scan.next();

    switch (symbol) {
        case "+":
             System.out.print(a+b);           
            break;
        case "-":
            System.out.print(a-b);
            break;
        case "*":
            System.out.print(a*b);
            break;
        case "/":
            if(b!=0) System.out.print(a/b);
            else System.out.print("На 0 делить нельщя!");
            break;
        default:
            System.out.print("Неизвестная операция");
            break;
    }
    }
}
