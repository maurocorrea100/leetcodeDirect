class Solution {
    class MyObject implements Comparable<MyObject>{
    public  Integer value;
    public  Integer amount;

    MyObject(int value, int amount){
        this.value = value;
        this.amount = amount;
    }
    @Override
    public int compareTo(MyObject o) {
        return this.amount.compareTo(o.amount);
    }
}
    
    public int[] topKFrequent(int[] nums, int k) {
          Map<Integer,Integer> map = new HashMap<>();

        for (int n : nums) {
            if(map.containsKey(n)) map.put(n, map.get(n) + 1);
            else map.put(n,1);
        }
        
        PriorityQueue<MyObject> q = new PriorityQueue<>(k);

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(q.size()==k){
                int val1 = q.peek().amount;
                if(entry.getValue()>val1){
                    q.poll();
                    q.offer(new MyObject(entry.getKey(), entry.getValue()));
                }
            }else q.offer(new MyObject(entry.getKey(), entry.getValue()));
        }

        int[] arr = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = q.poll().value;
        }
        return arr;
    }
}