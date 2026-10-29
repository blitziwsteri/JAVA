package lesson4;
import java.util.Scanner;

public class z10 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int[] array = {1, 2, 8, 0, 5};


    for(int i = array.length-1; i>=0; i--){
        System.out.print(array[i] + " ");
    }
    }
}
