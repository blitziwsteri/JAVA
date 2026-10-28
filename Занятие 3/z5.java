package lesson2;
import java.util.Scanner;

public class z5 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int sum = 0;
    int N = scan.nextInt();
    for(int i = 1; i<=N; i++) sum += i;
    System.out.print(sum);
    }
}
