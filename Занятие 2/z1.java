package lesson1;
import java.util.Scanner;

public class z1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt(); 
        if(number%2==0) System.out.println("Число четное"); else System.out.println("Число нечетное");
    }
}

