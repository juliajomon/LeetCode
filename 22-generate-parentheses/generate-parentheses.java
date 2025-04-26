class Solution {
    public List<String> generateParenthesis(int n) {
        Stack<Character> st = new Stack<>();
        List<String> res = new ArrayList<String>();
        backtrack(0,0, st ,res , n);
        return res;
    }
        private void backtrack(int open , int close ,Stack<Character> st, List<String> res , int n){
            if( open == n && close == n){
                StringBuilder sb = new StringBuilder();
                for (char c : st) sb.append(c);
                    res.add(sb.toString());
                return;
            }
            if(open < n){
                st.push('(');
                backtrack(open +1 , close, st , res , n);
                st.pop();
            }
            if( close < open){
                st.push(')');
                backtrack(open, close+1 , st ,res , n);
                st.pop();
            }
        }
        
    
}
