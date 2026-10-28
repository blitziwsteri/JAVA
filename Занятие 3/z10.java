package lesson2;
import java.util.Scanner;

public class z10 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    for(int i = 1; i<=20; i++){
        if(i%2==0) continue;
        else System.out.println(i);
    }
    }
}

