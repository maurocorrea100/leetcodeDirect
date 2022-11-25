class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();

        for (int n : nums){
            if(pq.size()==k){
                if(n > pq.peek()){
                    pq.poll();
                    pq.add(n);
                    continue;
                }
            }else{
                pq.add(n);
            }
        }
        return pq.peek();
    }
}