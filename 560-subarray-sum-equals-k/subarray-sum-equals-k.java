class Solution {
    public int subarraySum(int[] nums, int k) {
        int sub = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] pref = new int[nums.length];
        pref[0]= nums[0];
        map.put(0, 1);
        map.put(pref[0], map.getOrDefault(pref[0], 0) + 1);
        if (pref[0] == k) sub++;
        for(int i = 1 ; i< nums.length ; i++){
            pref[i] = pref[i-1] + nums[i];
            if(map.containsKey(pref[i] - k)){
                sub += map.get(pref[i] - k);
            }
            map.put(pref[i], map.getOrDefault(pref[i], 0) + 1);
        }
        



        /* Brute force
        for(int i = 0 ; i < nums.length ; i++){
            int sum=0;
            for(int j = i ; j< nums.length ; j++){
                sum+=nums[j];
                if(sum == k) {
                    sub++;
                }
                
            }
        
        }*/
        return sub;
    }
}