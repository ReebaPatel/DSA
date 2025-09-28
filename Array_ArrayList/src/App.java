import java.util.Arrays;
import java.util.Scanner;

public class App {
    // static int[] change(int[] arr){
    // arr[1] = 8;
    // return arr;

    // }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // integer array
        // int[] arr = new int[5];
        // for(int i = 0; i < arr.length; i++){
        // arr[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

        // string array
        // String[] str = new String[4];
        // for(int i = 0; i< str.length; i++){
        // str[i] = sc.next();
        // }
        // System.out.println(Arrays.toString(str));

        // integer array traversed with for each loop
        // int arr[] = {1,2,3,4,5,6};
        // for (int i : arr) {
        // System.out.print(i + " ");
        // System.out.println(Arrays.toString(i)); //wont work
        // }

        // functions
        // int[] arr = new int[5];
        // for(int i = 0; i< arr.length; i++){
        // arr[i] = sc.nextInt();
        // }
        // int[] updated = change(arr);
        // System.out.println(Arrays.toString(updated));

        // multidimensional arrays
        // declared
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9} };
        // for(int r = 0; r< arr.length; r++){
        // System.out.println(Arrays.toString(arr[r]));
        // }

        // user input and print
        int[][] arr = new int[3][3];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = sc.nextInt();
            }
        }

        // print usong for
        // for (int r = 0; r < arr.length; r++) {
        //     System.out.println(Arrays.toString(arr[r]));
        // }

        // print using for each
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));

        }

       sc.close();
    }
}
