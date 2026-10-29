package lesson4;
import java.util.Scanner;

public class z6 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        
    int[] N = {1, 2, 8, 4, 5};
    int max = N[0];
    int ind = 0;

    for(int i = 0; i<N.length; i++){
        if(max<N[i]){ max = N[i]; ind = i;}
    }

    System.out.printf("Макс число %d с индексом %d", max, ind);
    }
}
