import java.util.Arrays;

public class App {
    static void swap(int[] arr, int i , int j){
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] =  temp;
    }
    static void sortArray(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }

      
    }



    public static void main(String[] args) throws Exception {
        int[] arr= {3,2,1,5,4};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
