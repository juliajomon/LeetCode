class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        int j = n-1;
        if(i>=0){
            
            while( j>=0 && nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i,j);
        }
        if(i==j){
            reverse(nums,i,n-1);
        }
        else reverse(nums, i+1, n-1);
    }
    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums , int i , int n){
        while(i <n){
            swap(nums, i++, n--);
            
        }
    }
}