class Solution {
    public int maxSubArray(int[] nums) {
        int sum  = nums[0] ;
        int max = 0;
        for(int i = 0 ; i< nums.length ; i++){
            max = Math.max(nums[i],max + nums[i]);
            sum = Math.max(max , sum);
             
        }
        return sum;
    }
}