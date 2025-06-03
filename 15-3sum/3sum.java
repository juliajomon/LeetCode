class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //array length should not be less than 3
        if(nums.length < 3) return new ArrayList<>();
        //sort array
        Arrays.sort(nums);
        //create a hash list for result as hash list remove duplicate
        Set<List<Integer>> result = new HashSet<>();
        //for loop to iterate the array till length -2
        for(int i = 0 ; i< nums.length -2 ; i++){
        //2 pointers left and right
        int left = i+1;
        int right = nums.length -1;
        //check if array (i) + left  + right = 0 if true add to the result
        while(left < right){
            int sum = nums[i]+nums[left]+nums[right];
            if(sum == 0) 
            {
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }
            //else check if sum > 0 left ++ else right--
            else if(sum <0) left++;
            else right--;
        }
        }
        return new ArrayList<>(result);
        
    }
}