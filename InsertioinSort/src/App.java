import java.util.Arrays;

public class App {
    static void insertion(int[] arr){
        for (int i = 0 ; i< arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int i , int j){
        int temp =0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {3,2,1,4,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        }
}
