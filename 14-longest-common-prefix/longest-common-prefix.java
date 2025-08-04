class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        char[] c1 = strs[0].toCharArray();
        char[] c2 = strs[strs.length-1].toCharArray();
        for(int i =0 ; i < c1.length ; i++){
            if(c1[i] != c2[i]){
                return sb.toString();
            }
            sb.append(c1[i]);
        }
        return sb.toString();
    }
}