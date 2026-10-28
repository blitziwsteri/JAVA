package lesson2;
import java.util.Scanner;

public class z12 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int sum = 0;

    for(int i = 1; i<=100; i++){
        if(i%3==0) continue;
        else sum +=i;
    }
    System.out.print(sum);
    }
}

