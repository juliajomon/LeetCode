class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k% n;
        reverse(nums, 0, n-1);
        reverse(nums, 0 , k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int[] nums , int start , int end){
        while(start< end){
            swap(nums , start , end);
            start++;
            end--;
        }
    }
    public void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }
}