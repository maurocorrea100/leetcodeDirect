class Solution {
    public String frequencySort(String s) {
    int[] count = new int[256];
    StringBuilder sb = new StringBuilder();
    List<List<Integer>> list = new ArrayList<>();
    
    for (int i = 0; i < s.length(); i++) count[s.charAt(i)]++;
    for (int i = 0; i < s.length()+1; i++) list.add(new ArrayList<Integer>());
    for (int i = 0; i < count.length; i++) if (count[i] != 0) list.get(count[i]).add(i);
            
    for (int i = list.size()-1; i >= 0; i--){
        if (list.get(i) != null){
            List<Integer> temp = list.get(i);
            for(int k = 0; k < temp.size(); k++){
                for (int m = 0; m < i; m++){
                    sb.append(Character.toChars(temp.get(k)));
                }
            }
        }
    }
    return sb.toString();
    }
}