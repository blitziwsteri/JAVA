package lesson4;
import java.util.Scanner;

public class z7 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        
    int[] N = {1, 2, 8, 0, 5};
    int min = N[0];

    for(int i = 0; i<N.length; i++){
        if(min>N[i]){ min = N[i]; }
    }

    System.out.printf("Мин число %d ", min);
    }
}
