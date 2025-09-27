public class ceil {
    static int Ceilsearch(int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return arr[mid+1];
            }
            if(target > arr[mid] ){
                s = mid + 1; 
            }else if (target < arr[mid]){
                e = mid - 1;
            }
        }
        // return e; //floor
        return s; //ceil
    }
    public static void main(String[] args) {
        int arr[] = {4, 6, 28, 39, 40, 58, 82};
        System.out.println(Ceilsearch(arr, 40));
    }


}
