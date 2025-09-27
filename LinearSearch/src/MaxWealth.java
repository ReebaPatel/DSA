public class MaxWealth {
    static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int r = 0; r < accounts.length ; r++){
            int rowsum =0;
            for( int c = 0 ; c < accounts[r].length ; c++){
                rowsum += accounts[r][c];
            }
            if(rowsum > max){
                max = rowsum;
            }
        }
return max;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
}
