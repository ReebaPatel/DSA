import java.util.Arrays;

public class App {
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int n = arr.length - i - 1;
            int maxIndex = getmax(arr, 0, n);
            swap(arr, maxIndex, n);
        }
    }

    static int getmax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 3, 2, 1, 4, 5 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
