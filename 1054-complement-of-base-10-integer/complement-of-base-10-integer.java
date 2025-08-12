class Solution {
    public int bitwiseComplement(int n) {
        String str = intToBinary(n);
        String str2 = toggle(str);
        return binaryToInt(str2);

    }
    public String intToBinary(int n){
        return Integer.toBinaryString(n);
    }
    public String toggle(String n){
        StringBuilder sb = new StringBuilder();
        for(char s : n.toCharArray()){
            sb.append(s== '1' ? '0':'1');
        }
        return sb.toString();
        

    }
    public int binaryToInt(String n){
        return Integer.parseInt(n,2);

    }
}