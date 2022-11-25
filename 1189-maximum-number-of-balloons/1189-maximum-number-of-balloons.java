class Solution {
    public int maxNumberOfBalloons(String text) {
                if(!text.contains("b") || !text.contains("a")
                || !text.contains("l")
                || !text.contains("o")
                || !text.contains("n")){
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++){
            boolean exists = text.charAt(i)=='b' || text.charAt(i)=='a' ||text.charAt(i)=='l' ||text.charAt(i)=='o' ||text.charAt(i)=='n';

            if(exists){
                if(map.containsKey(text.charAt(i))){
                   map.put(text.charAt(i), map.get(text.charAt(i))+1);
                }else{
                    map.put(text.charAt(i),1);
                }
            }
        }
        map.put('l', map.get('l')/2);
        map.put('o', map.get('o')/2);

        return map.values().stream().min(Integer::compare).get();
    }
}