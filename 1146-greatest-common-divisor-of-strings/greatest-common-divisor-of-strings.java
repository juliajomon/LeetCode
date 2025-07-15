class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int i =0;
        String gcd = String.valueOf(str2.charAt(i));
        i++;
        while(str1.contains(gcd) && i < str2.length()){   
            gcd += String.valueOf(str2.charAt(i));
            i++;
        }
        while(!gcd.equals("")){
            if(isDivisible(str1,gcd) && isDivisible(str2,gcd)){
                return gcd;
            }
            else{
                gcd = gcd.substring(0, gcd.length() -1);
            }
        }
        return gcd;
    }
     public boolean isDivisible(String full , String part){
        if(full.length() % part.length() != 0) return false;
        int times = full.length() / part.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< times ; i++){
            sb.append(part);
        }
        return sb.toString().equals(full);
     }
}