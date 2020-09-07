import java.util.Arrays;

public class task_8 {
    public static void main(String[] args) {

        int[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        Arrays.sort(arr);

        System.out.println("Максимальное значение:" + arr[arr.length - 1]);


        int sum = 0;
        int count = 0;

        for (int i : arr) {
            if (i > 0) {
                sum += i;
            } else if (i > 0) {
                count++;
            }
        }
        System.out.println("Сумма положительных элементов: " + sum);


        // System.out.println("Сумма четных отрицательных элементов: " + sum);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных элементов: " + count);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }


        }
        System.out.println("Среднее арифметическое отрицательных элементов: " + count);
    }
}
