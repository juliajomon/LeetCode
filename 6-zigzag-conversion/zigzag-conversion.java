class Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1) return s;
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int in = (numRows -1)*2;
        for(int r =0 ; r < numRows ; r++){
                for(int i = r ; i < c.length ; i+= in){
                    
                        sb.append(c[i]);
                    if(r > 0 && r < numRows -1 && i+ in-2*r < c.length){
                        
                        sb.append(c[i+in -2*r]);
        }
                }
        }
        return sb.toString();
        
    }
}