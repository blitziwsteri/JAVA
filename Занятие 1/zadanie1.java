import java.util.Scanner;
public class zadanie1 {
    public static void main(String args[]){
        //Задание 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scan.next();
        System.out.println("Введите ваш возраст:");
        int age = scan.nextInt();
        System.out.println("Введите вашу специальность");
        String spec = scan.next();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Мне " + age + " лет.");
        System.out.println("Я изучаю " + spec + ".");

        //Задание 2
        System.out.println("*********");
        System.out.println("* JAVA  *");
        System.out.println("*********");

        //Задание 3
        int seventeen = 17;
        int five = 5;
        System.out.printf("Сумма: %d \nРазность: %d \nПроизведение: %d \nЦелочисленое деление: %d \nОстаток от деления: %d", seventeen+five, seventeen-five, seventeen*five, seventeen/five, seventeen%five);
        
        //Задание 4
        double side1 = 8.5;
        double side2 = 3.2;

        System.out.printf("Площадь прямоугольника: %f \nПериметр прямоуголника: %f", side1*side2, side1*2 + side2*2);

        //Задание 5
        double Celsie = 23.5;
        double F = Celsie * 9 / 5 + 32;
        System.out.printf("%f °C = %f °F", Celsie, F);

        //Задание 6
        System.out.println("Введите ваше имя: ");
        name = scan.next(); //Не использовал объявление,т.к. оно было в 7 строке
        System.out.println("Введите ваш год рождения: ");
        int dateofage = scan.nextInt();

        System.out.printf("Здраствуйте %s. В 2050 году вам исполниться %d", name, 2050-dateofage);

        //Задание 7
        System.out.println("Введите стоимость товара: ");
        double price = scan.nextDouble();
        System.out.println("Введите кол-во товара: ");
        int count = scan.nextInt();

        System.out.printf("Стоимость покупки без скидки: %f \nСтоимость покупки с 10% скидской: %f", price*count, price*count*0,9);

        //Задание 8
        System.out.println("Введите 3 оценки ученика");
        int grade1 = scan.nextInt();
        int grade2 = scan.nextInt();
        int grade3 = scan.nextInt();
        
        System.out.printf("Средняя оценка ученика: %.2f", (grade1 + grade2 + grade3)/3.0);

        //Задание 9
        double price1 = 149.99;

        System.out.println((int) price1); //Дробная часть просто "отбрасывается" без округления

        //Задание 10
        int a1 = 5;
        int b1 = 10;

        int c1 = a1;
        a1 = b1;
        b1 = c1;

        System.out.printf("a сейчас равна %d, ранее %d \n b сейчас равна %d, ранее %d", a1, b1, b1, a1);

        //Задание 11
        int a2 = 5;
        int b2 = 10;
        
        a2 = a2+b2;
        b2 = a2-b2;
        a2 = a2-b2;

        System.out.printf("a = %d \n b = %d", a2, b2);

        //Задание 12
        String product = scan.next();
        double price2 = scan.nextDouble();
        int count1 = scan.nextInt();

        System.out.printf("========================\nЧек\n------------------------\nТовар: %s\nЦена за шт.: %.1f\nКоличество: %d\n------------------------\nИтого: %.1f\n========================", product, price2, count1, price2*count1);
    }
}
