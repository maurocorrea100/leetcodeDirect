class Solution {
    public int maxNumberOfBalloons(String text) {
     int b = 0, a = 0, l = 0, o = 0, n = 0;
        
        for(char ch : text.toCharArray()){
            switch(ch){
                case 'b': ++b;
                        break;
                case 'a': ++a;
                        break;
                case 'l': ++l;
                        break;
                case 'o': ++o;
                        break;
                case 'n': ++n;
                        break;
            
            }
        }
        
         l=l/2;
        o=o/2;
        int min = b;
        min = Math.min(min, a);
        min = Math.min(min, l);
        min = Math.min(min, o);
        min = Math.min(min, n);

        return min;
    }
}