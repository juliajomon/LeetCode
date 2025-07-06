class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;
        for(int i =0 ; i<k ;i++){
            sum += nums[i];
        }
        double avg= sum/k;

        for(int i=k;  i < nums.length ;i++){
            sum = sum + nums[i] - nums[i-k];
            double currsum= sum/k;
            avg= Math.max(currsum, avg);
        }
        return avg;
        
    }
}