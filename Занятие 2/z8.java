package lesson1;
import java.util.Scanner;

public class z8 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        
    int grade = scan.nextInt();
    if(grade>=0 && grade<=100){
        if(grade<60) System.out.print("неудовлетворительно");
        else if(grade>=60 && grade<=74) System.out.print("удовлетворительно");
        else if(grade>=75 && grade<=89) System.out.print("хорошо");
        else System.out.print("отлично");
    }
    else System.out.print("Введите корректное число!");
    }
}
