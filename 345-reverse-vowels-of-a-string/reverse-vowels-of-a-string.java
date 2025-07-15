class Solution {
    public String reverseVowels(String s) {
       int l =0;
       int r = s.length()-1;
       char[] arr = s.toCharArray();
       while(l < r){
        if(vowel(arr[l])){
            if(!vowel(arr[r])){
                r--;
            }
            else if(vowel(arr[r])){
                swap(arr, r , l);
                r--;
                l++;   
            }
        }
        else l++;
       }
       return new String(arr); 
    }
    public boolean vowel(char c){
        if(c == 'a' || c == 'e'|| c == 'i'||c == 'o'||c == 'u' || c == 'A' || c == 'E'|| c == 'I'||c == 'O'||c == 'U'){
            return true;
        }
        return false;
    }
    public void swap(char[] arr, int r,int l){
        char temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
    }
}