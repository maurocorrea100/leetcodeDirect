class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if(pattern.length() != strArr.length) return false;
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < strArr.length; i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(strArr[i]))return false;
            }else{
                map.put(pattern.charAt(i), strArr[i]);
                set.add(strArr[i]);
                if(map.size()!=set.size()) return false;
            }
        }
        return true;
    }
}