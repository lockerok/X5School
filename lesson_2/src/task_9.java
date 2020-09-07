import java.util.Arrays;

public class task_9 {
    public static void main(String[] args) {

        int[] arr = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};

        for (int i = 0; arr.length/2 > i; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }

        System.out.println(Arrays.toString(arr));

    }
}