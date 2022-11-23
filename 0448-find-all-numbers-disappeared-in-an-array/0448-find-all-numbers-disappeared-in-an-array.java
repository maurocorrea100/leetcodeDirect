class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        int number = 1;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] == number){
               number++;
           } else if(nums[i] > number){
               while(number < nums[i]){
                   l.add(number);
                   number++;
               }
               number++;
           }
       }

       while(number<=nums.length){
           l.add(number);
           number++;
       }
        return l;
    }
}