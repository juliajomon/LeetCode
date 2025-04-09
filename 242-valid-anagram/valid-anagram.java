class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        else{
            char c1[] = s.toLowerCase().toCharArray();
            char c2[] = t.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2)){
                return true;
            }
        }
        return false;
    }
}