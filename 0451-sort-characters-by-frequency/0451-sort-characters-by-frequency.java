class Solution {
    public String frequencySort(String s) {
                HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            if(map.putIfAbsent(s.charAt(i),1)!=null) map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }

        Map<Integer,ArrayList<Character>> res = new TreeMap<>(Collections.reverseOrder());
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(res.putIfAbsent(entry.getValue(),new ArrayList<>(Arrays.asList(entry.getKey())))!=null)
                res.get(entry.getValue()).add(entry.getKey());
        }

        StringBuilder ans = new StringBuilder();
        for(Map.Entry<Integer, ArrayList<Character>> entry :res.entrySet()){
            int key = entry.getKey();
            for(Character el : entry.getValue()){
                int i = 1;
                while(i<=key) {
                    ans.append(el);
                    i++;
                }
            }
        }
        return ans.toString();
    }
}