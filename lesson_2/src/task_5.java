import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        System.out.println("Введите число 1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите число 2: ");
        int b = sc.nextInt();
        System.out.println("Введите число 3: ");
        int c = sc.nextInt();

        int x =0;
        if (a<b &a<c)x =a;
        else if (b<a&b<c)x =b;
        else if (c<a&c<b)x =c;

        System.out.println("Наименьшее введенное число:" + x);
    }
}