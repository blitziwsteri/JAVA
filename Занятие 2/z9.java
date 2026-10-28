package lesson1;
import java.util.Scanner;

public class z9 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    if((a+b)>c && (a+c)>b && (b+c)>a) System.out.print("Треугольник с данными сторонами существует"); //Мне было лень смотреть приоритет сравнения, поэтому сумма сторон в скобке))
    }
}
