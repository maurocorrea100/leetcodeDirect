class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<int[]> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') stack.push(new int[]{'(',i});
            else if(s.charAt(i) == ')')
               if(!stack.isEmpty() && stack.peek()[0] == '(') stack.pop();
               else stack.push(new int[]{')',i});
        }
        StringBuilder res = new StringBuilder(s);

        boolean fTime = true;
        for(int[] el : stack){
            res.replace(el[1],el[1]+1,"A");
        }

        int index = res.indexOf("A");
        while (index >= 0){
            res.deleteCharAt(index);
            index = res.indexOf("A");
        }

        return res.toString();
    }
}