import java.util.Arrays;

public class App {
    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) { //agar array sorted rehga to kabhi iske aage jaayega hi nahi
                    int temp = arr[ j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true; //first pass me hi agar swap nahi hua mtlb array is already sorted nad it can break outof it
                    //yaha tak swap nahi kiya mtlb swapped ka value change nahi kiya so it will remain false
                    //array is sorted already
                }

            }
            if(swapped == false){ //break only if no swap happened
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 5,4,3,2,1 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
