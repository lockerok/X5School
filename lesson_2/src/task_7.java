import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код города:");
        int city_code = sc.nextInt();


    }
}


//7. Написать программу, вычисляющую стоимость 10
//минутного междугороднего разговора в зависимости
//от кода города. ( Москва(905) - 4.15руб. Ростов(194) -
//1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00
//руб. ). Пользователь в консоли должен ввести код
//города, а в ответ от программы получить, например,
//при вводе кода 905, - «Москва. Стоимость разговора:
//41.5»