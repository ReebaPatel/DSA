public class AgnosticBS {
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // order-agnostic arr
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] ==  target){
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }

            } 
            else {
                if(target < arr[mid]){
                    start = mid+1;
                } 
                else if (target > arr[mid] ){
                    end = mid-1;
                }                 
            }
            
        }
        return -1;

    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 32, 43, 54, 67 };
        int target = 54;
        System.out.println(binarysearch(arr, target));
    }
}
