package lesson1;
import java.util.Scanner;

public class z7 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int lenght = scan.nextInt();
    boolean hasDigit = scan.nextBoolean();

    if(lenght>=8 && hasDigit) System.out.print("Пароль надеждный"); else System.out.print("Пароль не надежный");
    
        
    }
}
