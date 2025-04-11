class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer ,Integer>map = new HashMap(); 
       for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
       
       }
       List<Map.Entry<Integer, Integer>> values = new ArrayList<>(map.entrySet());
       values.sort((a,b) -> b.getValue() - a.getValue());
       int[] result = new int[k];
       for(int j= 0 ; j<k ; j++){
        result[j] = values.get(j).getKey();
       }
       return result;
    }
    
}