class MinStack {
    Stack<Integer> st = new Stack<Integer>();
    int min = Integer.MAX_VALUE;
    public void push(int val) {
        if(val <= min){
            st.push(min);
            min=val;
        }
        st.push(val);
    }
    
    public void pop() {
        if (st.pop() == min){
            min = st.pop() ;
        }
    }
    
    public int top() {
       int Top = st.peek();
       return Top;
    }
    
    public int getMin() {
    
        return min ;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */