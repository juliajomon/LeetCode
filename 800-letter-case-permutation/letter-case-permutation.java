class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> output = new ArrayList<>();

        backtracking(s.toCharArray(),0, output);
        return output;

    }
    public void backtracking(char[] s , int index , List<String> output){
        if(index == s.length){
            output.add(new String(s));
            return ;
        }
        backtracking(s,index+1,output);
        if(Character.isLetter(s[index])){
            s[index] ^= 32;
            backtracking(s,index+1,output);
            s[index] ^= 32;
        }
    }
}