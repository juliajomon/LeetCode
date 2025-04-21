class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> num = new Stack <>();

        for( String c : tokens){
            
            if(c.equals("+")){
                int num1 = num.pop();
                int num2 = num.pop();
                num.push(num1 + num2);
            }
            else if(c.equals("-")){
                int num1 = num.pop();
                int num2 = num.pop();
                num.push(num2 - num1);
            }
            else if(c.equals("*")){
                int num1 = num.pop();
                int num2 = num.pop();
                num.push(num1 * num2);
            }
            else if(c.equals("/")){
                int num1 = num.pop();
                int num2 = num.pop();
                num.push(num2 / num1);
            }
            else num.push(Integer.parseInt(c));
        }
        return num.pop();
        
    }
}