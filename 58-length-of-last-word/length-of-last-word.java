class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split("\\s+");
        char[] c = str[str.length -1].toCharArray();
        return c.length;
    }
}