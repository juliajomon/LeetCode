class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maximum = 0;
        for(int candy : candies){
            maximum = Math.max(maximum , candy);
        }
        for(int candy : candies){
            candy+= extraCandies;
            if(candy>=maximum){
                list.add(true);
            }
            else list.add(false);
        }
        return list;

    }
}