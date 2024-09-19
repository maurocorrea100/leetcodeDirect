class Solution {
   public String[] uncommonFromSentences(String s1, String s2) {
Map<String,Integer>map1 = new HashMap<>();
		List<String> list = new ArrayList<>();

		for(String el : s1.split(" ")){
			if(!map1.containsKey(el)) map1.put(el,1);
			else map1.put(el, map1.get(el)+1);
		}
		for(String el : s2.split(" ")){
			if(!map1.containsKey(el)) map1.put(el,1);
			else map1.put(el, map1.get(el)+1);
		}

		for(Map.Entry<String,Integer> pair : map1.entrySet()){
			String key = pair.getKey();
			int value = pair.getValue();
			if(value == 1) list.add(key);
		}
		return list.toArray(new String[0]);
}
}