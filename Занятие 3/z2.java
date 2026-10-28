package lesson2;
import java.util.Scanner;

public class z2 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int sum = 0;
    int number = scan.nextInt();
    while(number!=0){
    sum += number;
    number = scan.nextInt();
    }
    System.out.print(sum);
    }
}
