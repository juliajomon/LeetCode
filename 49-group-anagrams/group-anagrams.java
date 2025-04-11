class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String str : strs){
            String frequency = getFrequencyString(str);
            if(map.containsKey(frequency)){
                map.get(frequency).add(str);
            }
            else{
                List<String> strarr = new ArrayList<>();
                strarr.add(str);
                map.put(frequency,strarr);
            }
        }
        return new ArrayList<>(map.values());
    }
    private String getFrequencyString(String str){
            int[] count = new int[26];
            for (char c : str.toLowerCase().toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder freq = new StringBuilder("");
            char c = 'a';
            for (int i  : count){
                freq.append(c).append(i);

            }
            return freq.toString();
       }
}