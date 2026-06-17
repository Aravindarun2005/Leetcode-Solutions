class MinStack {
        Stack<Integer> stk;
        Stack<Integer> astk;
    public MinStack() {
        stk=new Stack<>();
        astk=new Stack<>();
    }
    
    public void push(int value) {
        stk.push(value);
        if(astk.isEmpty())
            astk.push(value);
        else
        {
            if(astk.peek()<value)
                astk.push(astk.peek());
            else
                astk.push(value);
        }
    }
    
    public void pop() {
        if(stk.isEmpty())
           return;
        stk.pop();
        astk.pop();        
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        if(astk.isEmpty())
            return -1;
        return astk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */