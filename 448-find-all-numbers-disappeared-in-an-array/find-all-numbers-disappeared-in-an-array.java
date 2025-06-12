class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> arr  = new ArrayList<>();
        for(int i = 1; i<= nums.length; i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}