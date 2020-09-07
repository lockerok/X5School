import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();

        if (a == 0) {
            System.out.print("нулевое число");
        } else {
            if (a > 0) {
                System.out.print("положительное ");
            } else {
                System.out.print("отрицательное ");
            }
            if (a % 2 == 0) {
                System.out.print("четное ");
            } else {
                System.out.print("нечетное ");
            }
            System.out.println("число");
        }
    }
}