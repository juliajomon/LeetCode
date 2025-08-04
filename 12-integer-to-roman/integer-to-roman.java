class Solution {
    public String intToRoman(int num) {
        int[] n = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] s = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i< n.length ; i++ ){
            int count =num/n[i];
            String val = s[i];
            sb.append(val.repeat(count));
            num = num %n[i];

        }
        return sb.toString();
    }
}