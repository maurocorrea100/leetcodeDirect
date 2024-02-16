class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
       Map<Integer,Integer> map = new HashMap<>();
        for(int a:arr) map.put(a, 1 + map.getOrDefault(a, 0));
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
        System.out.println(pq);
        while (k > 0)
            k -= pq.poll();
        return k < 0 ? pq.size() + 1 : pq.size();
    }
}