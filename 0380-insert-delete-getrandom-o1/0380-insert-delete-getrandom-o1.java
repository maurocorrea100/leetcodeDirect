class RandomizedSet {

    java.util.Random rand = new java.util.Random();
    Map<Integer,Integer> locs;
    List<Integer> nums;
    public RandomizedSet() {
        locs = new HashMap<>();
       nums = new ArrayList<>();
    }

    public boolean insert(int val) {
       if(!locs.containsKey(val)){
           locs.put(val,nums.size());
           nums.add(val);
           return true;
       }
       return false;
    }

    public boolean remove(int val) {
        if(locs.containsKey(val)){
            int loc = locs.get(val);
            if(loc < nums.size()-1){
                int lastone = nums.get(nums.size()-1);
                nums.set(loc,lastone);
                locs.put(lastone,loc);
              
            }
            locs.remove(val);
             nums.remove(nums.size()-1); 
            return true;
        }
        return false;
    }

    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */