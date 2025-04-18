class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> cons = new HashSet<>();
        Map<Integer,List<Integer>> map = new HashMap();
        for (int num : nums) {
            cons.add(num);
        }
        int longest = 0;
        int streak=0 ;
        int curr = 0;
        for(int num :cons){
            if(!cons.contains(num-1)){
                curr = num;
                streak = 1;
            }
            while(cons.contains(curr+1)){
                curr++;
                streak++;
            }
            longest = Math.max(longest, streak);
        }
        return longest;
    }
}