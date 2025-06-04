class Solution {
    public int trap(int[] height) {
       //left and right pointer , leftmax and rightmax =0
       int l=0;
       int rmax= 0;
       int lmax=0;
       int total =0;
       int r = height.length -1 ;
       //while left < right
       while(l <r){
       //if arr(left) <= arr(right)
       if(height[l] <= height[r]){
       //if leftmax > arr of left total += leftmax - arr(left) 
            if(lmax > height[l]){
                total += lmax - height[l];
            }
            else{
                //else leftmax = arr(left)
                lmax = height[l];
            }
        l++;
       }
        //else if rightmaax > arr(right) then total += rightmax - arr(right)
       //else rightmax = arr(right)
       //right--
        else{
            if(rmax > height[r]){
                total += rmax - height[r];
            }
            else{
                rmax = height[r];
            }
            r--;
        }  
        
       }
       return total;
    }
}