class Solution {
    public int jump(int[] nums) {
        if(nums.length ==1) return 0;
        int dest = nums.length -1 ;
        int cover = 0 ;
        int total =0;
        int last = 0;
        for(int  i =0 ; i < nums.length ; i++){
            cover = Math.max(cover,i+nums[i]);
            if(last  == i){
                last = cover;
                total++;
            }
            if(last >= dest) return total;
        }
        return total;
    }
}