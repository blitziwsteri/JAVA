package lesson4;
import java.util.Scanner;

public class z9 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int[] array = {1, 2, 8, 0, 5};
    int ind = -1;

    for(int i = 0; i<array.length; i++){
        if(array[i] == N){
            ind = i;
            break;
        }
    }
    if(ind!=-1) System.out.print(ind);
    else System.out.print("Не найдено");
    }
}
