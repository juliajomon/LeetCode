class Solution {
    public boolean increasingTriplet(int[] nums) {
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;
    for(int n : nums){
        if(n <= first){
            first=n;
        }
        if(n <= second && first < n ){
            second = n;
        }
        else if(first < second && second< n) return true;
    }
    return false;
    }
}