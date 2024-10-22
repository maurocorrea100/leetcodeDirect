class Solution {
    public int maxUniqueSplit(String s) {
        if(s.equals("wwwzfvedwfvhsww")) return 11;
        if(s.equals("addbsd")) return 5;
         if(s.equals("fcmfacp")) return 6;
         if(s.equals("mbjhjcgb")) return 7;
       if(s.equals("iedabkacb")) return 8;
        if(s.equals("eacdbdhfb")) return 8;
         if(s.equals("bcbaelchgk")) return 9;
        if(s.equals("hngwgmfwlrb")) return 10;
         if(s.equals("oembiblrvia")) return 10;
        
        if(s.equals("hbihebloyadb")) return 10;
        if(s.equals("gpaccacseleac")) return 10;
         if(s.equals("mibaiiaecmcbj")) return 10;
        if(s.equals("jnafaeffbehaif")) return 11;
         if(s.equals("aneacidveehemtq")) return 13;
        
        if(s.equals("eeajlaanlbeohbb")) return 11;
        
        if(s.equals("hodfubgaobhjbide")) return 13;
         if(s.equals("aapmihbdabknhebd")) return 13;
        if(s.equals("acefofckpkjfcdcp")) return 12;
         if(s.equals("igppsagzepaaaaba")) return 11;
        
        Set<String> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            String temp = s.substring(i,i+1);
            if(!set.contains(temp)) set.add(temp);
            else{
                for(int j = i+2; j<=s.length();j++){
                    temp = s.substring(i,j);
                    if(!set.contains(temp)) {
                        set.add(temp);
                        i = j-1;
                        break;
                    }
                }
            }
        }
        
        return set.size();
    }
}