class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        for(int i = 0; i<bank.length; i++){
            String flUp = bank[i];
            int amountUp = count(flUp);
            int j = i+1;
            while(j < bank.length){
                String flDown = bank[j];
                int amountDown = count(flDown);
                if(amountDown>0){
                    res = res+ amountUp*amountDown;
                    break;
                }
                j++;
            }
        }
        
        return res;
    }
    
    int count(String s){
        int sum = 0;
        for(int i =0; i < s.length(); i++) if(s.charAt(i)=='1') sum++;
        return sum;
    }
}