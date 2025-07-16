class Solution {
    public int maxOperations(int[] nums, int k) {
        int l =0;
        int r = nums.length -1;
        int c=0;
        Arrays.sort(nums);
        while(l<r){
            if(nums[l]+nums[r]==k){
                nums[l]=0;
                nums[r]=0;
                c++;
                l++;
                r--;
            }
            else if( nums[l]+nums[r] < k){
                l++;
            }
            else r--;
        }
        return c;
    }
}