package lesson4;
import java.util.Scanner;

public class z11 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int[] array = new int[N];


    for(int i = 1; i<array.length+1; i++){
        array[i-1] = i*i;

    }
    for(int i = 0; i<array.length; i++){
        System.out.print(array[i]+ " ");

    }
    }
}
