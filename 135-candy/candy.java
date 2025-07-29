class Solution {
    public int candy(int[] ratings) {
        int[] nums = new int[ratings.length];
        for(int i = 0 ; i < ratings.length ; i++){
            nums[i] =1;
        }
        for(int i = 1 ; i < ratings.length ; i++){
            if(ratings[i] > ratings[i-1]){
                nums[i] = nums[i-1]+1;
            }
        }
        for(int i = ratings.length-2 ; i >=0 ; i--){
            if(ratings[i] > ratings[i+1]){
                if(nums[i] > nums[i+1]) continue;
                nums[i] = nums[i +1]+1;
            }
        }
        int sum =0;
        for(int i =0 ; i< ratings.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}