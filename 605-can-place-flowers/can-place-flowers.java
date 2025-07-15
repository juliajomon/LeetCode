class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // flower beds can place
        int count =0;
        if(flowerbed.length == 1 && flowerbed[0]==0 && n <=1) return true;
        if(flowerbed.length == 1 && flowerbed[0]==1 && n >=1) return false;
        if(flowerbed[0] ==0 && flowerbed[1] ==0){
            flowerbed[0] =2;
            
        }
        if(flowerbed[flowerbed.length-1] ==0 && flowerbed[flowerbed.length-2] ==0){
            flowerbed[flowerbed.length-1] =2;
        }
        for(int i  = 1; i < flowerbed.length-1 ; i++){
            if(flowerbed[i] ==0 && flowerbed[i-1] == 0  &&  flowerbed[i+1] ==0){
                flowerbed[i] =2;
            }
            else continue;
        }
        
        for(int flower : flowerbed){
            if(flower == 2){
                count++;
            }
        }
        if(count >= n){
            return true;
        }
        return false;
    }
}