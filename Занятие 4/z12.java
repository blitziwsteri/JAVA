package lesson4;
import java.util.Scanner;

public class z12 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int[] array = {1, -5, 8, 7, -10};


    for(int i = 0; i<array.length; i++){
        if(array[i]<0) array[i] = 0;
    }
    for(int i = 0; i<array.length; i++){
        System.out.print(array[i]+ " ");

    }
    }
}
