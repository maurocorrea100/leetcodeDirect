class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> winners = new ArrayList<>();
        List<Integer> loosers1 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

       Map<Integer,int[]> map = new TreeMap<>();

       for(int[] pair : matches){
           int winner = pair[0], looser = pair[1];
           if(map.containsKey(winner)) {
                map.get(winner)[0]++;
           }else map.put(winner,new int[]{1,0});

           if(map.containsKey(looser)){
               map.get(looser)[1]++;
           }else map.put(looser,new int[]{0,1});
       }

        for (var entry : map.entrySet()){
            int loosingScore = entry.getValue()[1];
            if(loosingScore == 0) winners.add(entry.getKey());
            if(loosingScore == 1) loosers1.add(entry.getKey());
        }

        //  Collections.sort(winners);
        // Collections.sort(loosers1);
        res.add(winners);
        res.add(loosers1);
        return res;
    }
}