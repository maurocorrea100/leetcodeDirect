class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Integer> list = new ArrayList<>(26);

        for(int i = 0; i < 26; i++){
            list.add(0);
        }

        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            list.set(index, list.get(index)+1);
        }

        for(int i = 0; i < t.length(); i++){
            int index = t.charAt(i) - 'a';
            list.set(index, list.get(index)-1);
            if(list.get(index)<0) return false;
        }

        for (int num : list) {
            if(num > 0 || num < 0 ) return false;
        }
        return true;
    }
}