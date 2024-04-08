class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
             Stack<Integer> st = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int countOnesSandwich = 0, countOnesStudent = 0;
        for(int i = sandwiches.length-1; i >=0; i--){
            st.push(sandwiches[i]);
            if(sandwiches[i]==1) countOnesSandwich++;
        }

        for(int el : students) {
            queue.add(el);
            if(el==1) countOnesStudent++;
        }
        if(countOnesStudent==countOnesSandwich) return 0;

        int couldnotServe = 0;

        while(true){
            if(st.peek() == queue.peek()){
                 couldnotServe=0;
                st.pop();
                queue.poll();
            }else{
                couldnotServe++;
                queue.add(queue.poll());
            }

            if(couldnotServe== queue.size()) return couldnotServe;
        }
}
}