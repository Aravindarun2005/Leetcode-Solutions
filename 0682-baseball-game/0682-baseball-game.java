class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("C"))
            {
                if(!stk.isEmpty())
                {
                    stk.pop();
                }
            }
            else if(operations[i].equals("D"))
            {
                if(!stk.isEmpty())
                {
                    stk.push(2*stk.peek());
                }
            }
            else if(operations[i].equals("+"))
            {
                if(!stk.isEmpty())
                {
                    int a=stk.pop();
                    if(!stk.isEmpty())
                    {
                        int b=stk.pop();
                        stk.push(b);
                        stk.push(a);
                        stk.push(a+b);
                    }
                }
            }
            else
            {
                stk.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        while(!stk.isEmpty())
        {
            sum+=stk.pop();
        }
        return sum;
    }
}