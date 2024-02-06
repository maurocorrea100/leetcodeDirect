class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for (String el:strs) {
            char[] arr = el.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(map.putIfAbsent(sorted,new ArrayList<>(Arrays.asList(el))) !=null) map.get(sorted).add(el);
        }
        
        for(List<String> list : map.values()) res.add(list);
        return res;
    }
}