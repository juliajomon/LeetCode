class Solution {
    public int maxProduct(int[] nums) {
        int sub =0;
        int mul =1;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0 ; i < nums.length ;i++){
            for(int j =i; j< nums.length ; j++){
                mul *= nums[j];
                sub = Math.max(sub, mul);
            }
            mul =1;
        }
        return sub;
    }
}