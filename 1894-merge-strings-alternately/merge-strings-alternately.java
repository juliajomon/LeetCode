class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word = "";
        String shorter =(word1.length() < word2.length())? word1 : word2;
        String longer =(word1.length() > word2.length())? word1 : word2;
        int i=0;
        for(i = 0 ; i < shorter.length(); i++){
           word += String.valueOf(word1.charAt(i));
           word += String.valueOf(word2.charAt(i));
        }
        for(int j = i; j < longer.length(); j++){
            word+= String.valueOf(longer.charAt(j));
        }
        return word;
    }
}