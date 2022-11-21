class Solution {
    public int numUniqueEmails(String[] emails) {
      Set<String> set = new HashSet<>();
        for (String el: emails) {
            String [] sArr = el.split("@");
            String [] local = sArr[0].split("\\+");
            set.add(local[0].replaceAll("\\.","") + "@" + sArr[1]);
        }
        return set.size();
    }
}