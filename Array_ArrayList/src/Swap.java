import java.util.Arrays;

public class Swap {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 2, 35, 43, 3 };
        swap(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
    }
}
