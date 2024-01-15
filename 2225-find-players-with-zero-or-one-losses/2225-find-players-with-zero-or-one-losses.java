class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winners = new TreeSet<>();
        Set<Integer> loosers1 = new TreeSet<>();
        List<List<Integer>> res = new ArrayList<>();

        HashMap<Integer, Integer> winnersMap = new HashMap<>();
        HashMap<Integer, Integer> losersMap = new HashMap<>();

        for(int[] pair : matches){
            if(winnersMap.containsKey(pair[0])) winnersMap.put(pair[0], winnersMap.get(pair[0])+1);
            else winnersMap.put(pair[0],1);

            if(losersMap.containsKey(pair[1])) losersMap.put(pair[1],losersMap.get(pair[1])+1);
            else losersMap.put(pair[1],1);
        }

        for(int[] pair : matches){
            if(winnersMap.containsKey(pair[0]) && !losersMap.containsKey(pair[0])) winners.add(pair[0]);
            if(losersMap.containsKey(pair[1]) && losersMap.get(pair[1]) == 1) loosers1.add(pair[1]);
        }

       
        res.add(winners.stream().toList());
        res.add(loosers1.stream().toList());
        return res;

    }
}