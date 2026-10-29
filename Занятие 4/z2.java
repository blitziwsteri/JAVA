package lesson4;
import java.util.Scanner;

public class z2 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int[] array = new int[N];

    for(int i = 0; i<N; i++){

        array[i] = scan.nextInt();

    }
    for(int j: array){

        System.out.printf("%d ", j);

    }
    }
}
