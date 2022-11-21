class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String el: emails) {
            String[] temp = el.split("@");
            temp[0] = temp[0].concat("@");
            // remove + portion
            StringBuilder sb = new StringBuilder(temp[0]);
              if(sb.indexOf("+") != -1){
                temp[0] = sb.delete(sb.indexOf("+"), sb.indexOf("@")).toString();
            }
            // remove dots from local
            temp[0] = temp[0].replaceAll("\\.","");
           // System.out.println(temp[0]+temp[1]);
            set.add(temp[0].concat(temp[1]));
        }
        return set.size();
    }
}