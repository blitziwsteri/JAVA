package lesson2;
import java.util.Scanner;

public class z14 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    for(int i = 1; i<=N; i++){
        for(int j = 1; j<=i; j++){
            System.out.printf("*");
        }
        System.out.print("\n");
    }
    }
}
