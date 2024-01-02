class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            List<Integer> tempList = new ArrayList<>();
            boolean newRow = true;
            for(List<Integer> l : lists){
                if(!l.contains(nums[i])){
                    l.add(nums[i]);
                    newRow = false;
                    break;
                }
            }
            if(newRow) {
                tempList.add(nums[i]);
                lists.add(tempList);
            }
        }

        return lists;
    }
}