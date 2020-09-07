import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int count = sc.nextInt();
        int lastCharacter = count%10;
        sc.close();

        System.out.println("Пследняя цифра введенного числа:" + lastCharacter);
    }
}