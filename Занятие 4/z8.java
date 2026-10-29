package lesson4;
import java.util.Scanner;

public class z8 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        
    int[] N = {1, 2, 8, 0, 5};
    int count = 0;

    for(int i = 0; i<N.length; i++){
        if(N[i]%2==0)  count+=1;
    }

    System.out.printf("Кол-во четных элементов %d ", count);
    }
}
