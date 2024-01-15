class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
          List<Integer> winners = new ArrayList<>();
        List<Integer> loosers1 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

       Map<Integer,ArrayList<Integer>> map = new TreeMap<>();

       for(int[] pair : matches){
           int winner = pair[0], looser = pair[1];
           if(map.containsKey(winner)) {
               map.get(winner).set(0,map.get(winner).get(0)+1);
           }else map.put(winner,new ArrayList<>(Arrays.asList(1,0)));

           if(map.containsKey(looser)){
               map.get(looser).set(1,map.get(looser).get(1)+1);
           }else map.put(looser,new ArrayList<>(Arrays.asList(0,1)));
       }

        for (var entry : map.entrySet()){
            int loosingScore = entry.getValue().get(1);
            if(loosingScore == 0) winners.add(entry.getKey());
            if(loosingScore == 1) loosers1.add(entry.getKey());
        }

        res.add(winners);
        res.add(loosers1);
        return res;
    }
}