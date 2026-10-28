package lesson1;
import java.util.Scanner;

public class z6  {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    if(a>=10 && a<=20) System.out.print("Число входит в диапозон от 10 до 20");
    else System.out.print("Число не входит в диапозон");
        
    }
}
