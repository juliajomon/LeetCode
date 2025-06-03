class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea = 0;
        int index,h;
        Stack<Integer[][]> st = new Stack<Integer[][]>();
        for(int i =0 ; i < heights.length ; i++){
            int  start = i;
            while(!st.isEmpty() && st.peek()[0][1]> heights[i] ){
                Integer[][] top = st.pop();
                index = top[0][0];
                h = top[0][1];
                maxarea = Math.max(maxarea , h *(i - index));
                start = index;
            }
            st.push( new Integer[][] {{start,heights[i]}});
        }
        while(!st.isEmpty()){
            Integer[][] top = st.pop();
            index = top[0][0];
            h = top[0][1];
            maxarea = Math.max(maxarea, h * (heights.length - index));
        }
        return maxarea;
    }
}