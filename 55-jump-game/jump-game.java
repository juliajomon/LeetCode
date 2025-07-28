class Solution {
    public boolean canJump(int[] nums) {
       if(nums.length == 1) return true;
       if(nums[0] == 0) return false;
       int finalpos = nums.length -1;
       for(int i = nums.length -2 ; i >= 0 ; i--){
        if(i+nums[i] >= finalpos){
            finalpos = i;
        }
       }
       if( finalpos == 0) return true;
       return false;

    }
}