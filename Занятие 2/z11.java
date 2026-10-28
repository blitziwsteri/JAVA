package lesson1;
import java.util.Scanner;

public class z11 {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int day = scan.nextInt();
    switch (day) {
        case 1:
            System.out.print("Понедельник \nБудний");
            break;
        case 2:
            System.out.print("Вторник \nБудний");
            break;    
        case 3:
            System.out.print("Среда \nБудний");
            break;
        case 4:
            System.out.print("Четверг \nБудний");
            break;
        case 5:
            System.out.print("Пятница \nБудний");
            break;
        case 6:
            System.out.print("СУББОТА \nВыходной");
            break;
        case 7:
             System.out.print("Воскресенье \nВыходной");
            break;   
        default:
        System.out.print("Некорректный номер дня");
            break;
    }
    }
}
