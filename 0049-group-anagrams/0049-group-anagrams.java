class Solution {
       public  List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            int[] arr = new int[26];
            for(int j = 0; j < s.length(); j++){
                arr[s.charAt(j) - 'a']++;
            }
            String rep = Arrays.toString(arr);
            if(map.containsKey(rep)){
                map.get(rep).add(s);
            }else{
                map.put(rep,new ArrayList<>());
                map.get(rep).add(s);
            }
        }
        List<List<String>> l = new ArrayList<>(map.values());

        return l;
       }
}