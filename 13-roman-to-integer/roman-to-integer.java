class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char[] val = s.toCharArray();
        result = toRoman(val[val.length-1]);
        for (int c= val.length-2 ;c >=0; c--){
            if(toRoman(val[c]) < toRoman(val[c+1])){
                result -= toRoman(val[c]);
            }
            else result += toRoman(val[c]);
        }
        return result;
    }
    public int toRoman(char c){
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        if(c == 'M') return 1000;
        return -1;
    }
}