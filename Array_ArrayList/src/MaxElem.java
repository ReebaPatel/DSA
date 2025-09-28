public class MaxElem {
    static int max(int[] arr){
        int max = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,3};
        System.out.println(max(arr));


    }
}
