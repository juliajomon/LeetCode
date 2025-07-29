class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length ;
        int[] arr=  new int[n+1];
        for(int i = 0 ; i < n ; i++){
            if(citations[i] > n){
                arr[n]++;
            }
            else arr[citations[i]]++;
        }
        int paper =0;
        int i =n;
        while(i >0){
            paper += arr[i];
            if(paper >= i)
                return i;
            i--;
        }
        return 0;
    }
}