package lesson2;
import java.util.Scanner;

public class z13 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    for(int i = 1; i<10; i++){
        for(int j = 1; j<10; j ++){
            System.out.printf("%d * %d = %d |", j, i, i*j);
        }
        System.out.print("\n\n");
    }
    }
}
