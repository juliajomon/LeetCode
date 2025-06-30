class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        int i =0;
        for(int num : nums1) arr[i++] = num;
        for(int num : nums2) arr[i++] = num;
        Arrays.sort(arr);
        int med= n/2;
        if(n%2 ==0){
           return (arr[med]+arr[med-1])/2.0;
        }
        else return arr[med];

    }
}