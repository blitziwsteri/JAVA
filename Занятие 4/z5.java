package lesson4;
import java.util.Scanner;

public class z5 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int[] array = new int[N];
    float sum = 0;

    for(int i: array){
    array[i] = scan.nextInt();
    sum += array[i];
    }
    System.out.print(sum/array.length);
    }
}
