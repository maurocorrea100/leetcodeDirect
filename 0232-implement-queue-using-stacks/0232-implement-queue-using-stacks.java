class MyQueue {

     Stack<Integer> st1,st2;
    int top;
    public MyQueue() {
        st1 = new Stack<>();
        st2= new Stack<>();
    }

    public void push(int x) {
        if(st1.isEmpty()  && st2.isEmpty()) top=x;
        st1.push(x);
    }

    public int pop() {
          if(st2.isEmpty()) while(!st1.isEmpty()) st2.push(st1.pop());
        int popping = st2.pop();
        if(st2.isEmpty()) {
            while (!st1.isEmpty()) st2.push(st1.pop());
        }
         if(!st2.isEmpty()) top = st2.peek();
        return popping;
    }

    public int peek() {
        return top;
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */