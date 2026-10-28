package lesson2;
import java.util.Scanner;

public class z11 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    for(int i = 2; i<=N-1; i++){
        if(N%i==0){
        System.out.print(i); 
        break;
        } 
    } 

    }
}
