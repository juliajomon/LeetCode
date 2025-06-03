class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> list =  new ArrayList<>();
        
        for (int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                list.add(Character.toLowerCase(c));
            }
        }
        int k = list.size() -1;
        for(int j = 0 ; j < list.size();j++){
            if(list.get(j) != list.get( (k - j))){
                return false;
            }
        }
        return true;
    }
}