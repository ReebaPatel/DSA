public class EvenDigits {
    static int findNumbers(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length ; i++){
            if (even(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int i){
        int count = 0;
        while(i>0){
            count++;
            i = i/10;         
        }
        if (count%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={12,354,244,1433};
        System.out.println(findNumbers(arr));
    }
}
