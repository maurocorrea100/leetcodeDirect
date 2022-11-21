class Solution {
    public int numUniqueEmails(String[] emails) {
               Set<String> set = new HashSet<>();
        for (String el: emails) {
            String [] sArr = el.split("@");
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while(i<sArr[0].length()){
                if(el.charAt(i) == '.'){
                      i++;
                    continue;
                }else if(el.charAt(i) == '+'){
                    break;
                }
                sb.append(el.charAt(i));
                i++;
            }
            set.add(sb.toString()+"@"+sArr[1]);
        }
        return set.size();
    }
}