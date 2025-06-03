class Solution {
    public int maxArea(int[] height) {
        //two pointers left and right 
        int left = 0;
        int right= height.length - 1;
        //set maxarea as 0
        int maxarea = 0;
        //while left< right do area = min of left and right * right - left
        while(left < right){
            int area = (Math.min(height[left],height[right]) * (right - left));
        //maxarea = max of area , maxarea
            maxarea = Math.max(maxarea, area);
        //if left < right left++ else right--}
            if(height[left] < height[right]) left++;
            else right-- ;
        }
        return maxarea;
    }

}