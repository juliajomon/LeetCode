class RandomizedSet {
    List<Integer> set = new ArrayList<>();
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
        set.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            int i =set.indexOf(val);
            set.remove(i);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int i = (int)(Math.random() * set.size());
        return set.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */