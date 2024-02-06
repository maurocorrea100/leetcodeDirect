class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (String el:strs) {
            char[] arr = el.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(map.putIfAbsent(sorted,new ArrayList<>(Arrays.asList(el))) !=null) map.get(sorted).add(el);
        }
        return new ArrayList<>(map.values());
    }
}