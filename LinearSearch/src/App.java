// import java.util.Arrays;

public class App {

    // search in the array
    // return the index if found
    // return -1 if not found
    static int linearsearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            // check every index if its element == target and returns index
            if (arr[i] == target) {
                return i;
            }
        }

        return -1; // -1 can never be the inedx but it can be an element
    }

    // check every index if elem = target and returns element
    static int linearsearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            // check every index if elem = target and returns element
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // check if target is there or not and return true/false
    static boolean linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            // check every index if elem = target and returns true/flase
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // search in strings
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        // string works like array only - array of characters (has indexes) -direct
        // access method
        // for (int i = 0; i < str.length() ; i++){
        // if (str.charAt(i) == target ){
        // return true;
        // }
        // }
        // return false;

        for (char ch : str.toCharArray()) {
            // The for-each loop in Java works only on:
            // arrays (int[], char[], etc.)
            // anything that implements Iterable (like ArrayList, HashSet, etc.)
            // 👉 But String itself is not an array, and it’s not Iterable<char> either.
            // but this creates an other array -so uses extra memory
            if (ch == target) {
                return true;

            }
        }
        return false;
    }

    // search in range
    // like maybe from one index to another
    static int rangesearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            // check every index if its element == target and returns index
            if (arr[i] == target) {
                return i;
            }
        }

        return -1; // -1 can never be the inedx but it can be an element
    }

    // print minimum maximum
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    // search in 2d array
    static int[] search1(int arr[][], int target) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) { // arr[r] is the no of cols in row r
                if (arr[r][c] == target) {
                    return new int[] { r, c };
                }
            }
        }
        // return -1;
        return new int[] { -1, -1 };

    }

    // find max in 2d array
    static int findmax(int arr[][]) {
        int max = Integer.MIN_VALUE;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) { // arr[r] is the no of cols in row r
                if (arr[r][c] > max) {
                    max = arr[r][c];
                }
            }
        }
        // return -1;
        return max;

    }

    public static void main(String[] args) throws Exception {
        // int[] array = { 2, 7, 5, 1, 10 };
        // int target = 7;
        // System.out.println(rangesearch(array, 7,0,3));
        // System.out.println(linearsearch3(array, target));
        // System.out.println(linearsearch1(array, target));
        // System.out.println(linearsearch2(array, target));
        // System.out.println(min(array));
        // String name = "reeba";
        // char target = 'f';
        // System.out.println(search(name, target));
        int[][] arr = {
                { 23, 4, 3 }, { 12, 45, 65, 23 }, { 34, 83, 54, 12 }, { 34, 65, 12, 75 }
        };
        // int target = 13;
        // int[] ans = search1(arr, target);
        // System.out.println(Arrays.toString(ans)); // needed bcz ans isa n array and
        // it would print the memory ish hash
        // code instead of array
        System.out.println(findmax(arr));
    }
}
