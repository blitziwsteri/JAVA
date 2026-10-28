package lesson1;
import java.util.Scanner;

public class z3 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        
    int age = scan.nextInt();

    if(age>=18) System.out.println("Доступ разрешен"); else System.out.println("Доступ запрещен");
    }
}
