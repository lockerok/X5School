import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        System.out.println("Сумма введенного числа:" + sum);
    }
}