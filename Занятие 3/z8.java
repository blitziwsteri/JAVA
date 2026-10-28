package lesson2;
import java.util.Scanner;

public class z8 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int sum = 0;
    int N = scan.nextInt();
    for(int i = 1; i<=N; i++) if(N%i==0) sum+=1;
    System.out.print(sum);
    }
}
