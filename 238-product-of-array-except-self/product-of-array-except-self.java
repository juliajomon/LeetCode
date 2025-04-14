class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int post = 1;
        int n = nums.length;
        int[] result = new int[n];
        result[0]=1;
        for(int i = 0 ; i<n ; i++){
            pre = pre *nums[i];
            if(i+1 < n){
                result[i+1]= pre;
            }
        }
        for(int j = n-1 ; j> 0 ; j--){
            post *= nums[j];
            if(j-1 >= 0){
                result[j-1] *= post;
            }
        }
        return result;
    }
}