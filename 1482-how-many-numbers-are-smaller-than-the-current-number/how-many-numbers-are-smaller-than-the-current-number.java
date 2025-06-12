class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] temp = nums.clone();
        Arrays.sort(temp);
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i= 0 ; i< temp.length ; i++){
            if(!map.containsKey(temp[i])){
            map.put(temp[i] , i);
            }
        }
        int[] result = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            result[i]= map.get(nums[i]);
        }
        return result;
    }
}