class NumArray {

    private int[] dp;
    public NumArray(int[] nums) {
        dp = new int[nums.length +1];
        dp[0] = nums[0];
        for(int i = 1 ; i < nums.length ;i++){
            dp[i] = dp[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        
        if(left == 0){
            return dp[right];
        }
        int sum = dp[right] - dp[left-1];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */