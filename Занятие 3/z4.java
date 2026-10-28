package lesson2;
import java.util.Scanner;

public class z4 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int number = 1;

    do {
        System.out.printf("%d^2 = %d\n", number, number*number);
        number++;
    } while(number!=11);
    }
}
