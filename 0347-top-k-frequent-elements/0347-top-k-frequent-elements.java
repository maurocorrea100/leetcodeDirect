class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int n : nums) {
            if(map.containsKey(n)) map.put(n, map.get(n) + 1);
            else map.put(n,1);
        }

        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(k, Comparator.comparingInt(a -> a.get(1)));

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(queue.size()==k){
                int val = queue.peek().get(1);
                if(entry.getValue()>val){
                    queue.poll();
                    queue.offer(Arrays.asList(entry.getKey(), entry.getValue()));
                }
            }else queue.offer(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        List<Integer> list = new ArrayList<>();
        queue.stream().forEach(a -> list.add(a.get(0)));
    
        return list.stream().mapToInt(i->i).toArray();
    }
}