class Solution {
    public int maxProfit(int[] price) {
        int maxprofit =0;
        if(price.length == 2){
            int prof= price[1] - price[0];
            return Math.max(maxprofit,prof);
        }
        int l = 0;
        int r =1;
        
        while(r< price.length){
            if(price[l] < price[r]){
                int prof = price[r]- price[l];
                maxprofit = Math.max(maxprofit, prof);
            }
            else
                l=r;
            r++;
        }
        return maxprofit;
    }
}