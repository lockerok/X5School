import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("Результат:" + (a+1));
        }
        else if (a<0){
            System.out.println("Результат:" + (a-2));
        }
        else {
            System.out.println("Результат:" + 10);
        }
    }
}