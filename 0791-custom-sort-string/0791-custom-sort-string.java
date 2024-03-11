class Solution {
    public String customSortString(String order, String s) {
               StringBuilder str = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
            else map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }

        for(int i = 0; i < order.length(); i++){
            if(map.get(order.charAt(i))!=null) {
                int amount = map.get(order.charAt(i));
                while (amount-- > 0) str.append(order.charAt(i));
                map.remove(order.charAt(i));
            }
        }

        for(Map.Entry<Character,Integer> pair : map.entrySet()){
            int size = pair.getValue();
            while(size-->0)str.append(pair.getKey());   
        }

        return str.toString();
    }
}