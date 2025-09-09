class Solution {
    public int maxVowels(String s, int k) {
        char[] c = s.toCharArray();
        int left =0;
        int right = k-1;
        int count=0;
        for(int i =0; i< k;i++){
            if(isVowel(c[i]))count++;
        }
        
        int max=count;
        int n= c.length;
        for(int i = k ; i < n ; i++){
            if(isVowel(c[i])) count++;//ryt
            if(isVowel(c[i-k])) count--;//left
            max = Math.max(max,count);
            if(max == k) return k;
        }
            
            
        
        return max;
        
    }
    public boolean isVowel(char c){
        return c =='a'|| c =='e'|| c =='i'|| c =='o'|| c =='u';
    }
}