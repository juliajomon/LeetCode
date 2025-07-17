class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i =0;
        while( i <n-2){
            if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
                push(nums,i ,n);   
                n--;
            }
            else i++;
        }
        return n;
    }
    public void push(int[]  nums , int i,int n){
        for(int j =i+2 ;j < n-1 ; j++){
            nums[j] = nums[j+1];
        }
        

    }
}