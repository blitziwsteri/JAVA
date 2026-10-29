package lesson4;
import java.util.Scanner;

public class z4 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int[] array = new int[N];
    int sum = 0;

    for(int i: array){
    array[i] = scan.nextInt();
    sum += array[i];
    }
    System.out.print(sum);
    }
}
