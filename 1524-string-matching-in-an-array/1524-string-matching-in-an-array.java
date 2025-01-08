class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList();
        Set<String> set = new HashSet();
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j< words.length; j++){
                if(words[i].contains(words[j])) set.add(words[j]);
                if(words[j].contains(words[i])) set.add(words[i]);
            }
        }

        List<String> mainList = new ArrayList<String>();
        mainList.addAll(set);
        return  mainList;
    }
}