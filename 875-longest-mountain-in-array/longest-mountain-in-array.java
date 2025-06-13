class Solution {
    public int longestMountain(int[] arr) {
        int l =0;
        int r = arr.length;
        int m=0;
        for (int i = 1; i < arr.length-1;i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                l=r=i;
            
                while(l>0 && arr[l-1] < arr[l]){
                    l--;
                }
                while(r<arr.length-1 && arr[r] > arr[r+1]){
                    r++;
                }
                m= Math.max(m, r-l+1);
            } 
        }
        return m;
    }
}