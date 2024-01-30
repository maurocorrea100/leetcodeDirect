class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1) return Integer.parseInt(tokens[0]);
           Stack<Integer> st = new Stack<>();
        int res = 0;
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int n1 = st.pop(), n2 = st.pop();
                if(token.equals("+")) res = n1+n2;
                else if(token.equals("-")) res = n2-n1;
                else if(token.equals("*")) res = n1*n2;
                else res = n2/n1;
                st.push(res);
            }else st.push(Integer.parseInt(token));

        }
        return res;
    }
}