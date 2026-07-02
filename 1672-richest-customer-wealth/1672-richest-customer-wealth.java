class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans_ = Integer.MIN_VALUE;
        for (int[] ints: accounts){
            int sum =0;
            for(int element : ints){
                sum += element;
            }
            if (sum > ans_){
                ans_ = sum;
            }
        }
        return ans_;
    }
    
}