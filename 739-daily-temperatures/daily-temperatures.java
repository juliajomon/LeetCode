class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length ;
        int[] days = new int[n];
        Stack <int[]> st = new Stack<>();
        days[n-1] = 0;
        for (int i = n-1 ; i>= 0 ; i--){
            while(!st.isEmpty()&& st.peek()[0] <=  temp[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                days[i] = st.peek()[1] - i;
            }
            st.push( new int[]{temp[i] , i});
        }
        return days;
    }
}