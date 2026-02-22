class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stk=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        int f=0;
        int res=0;
        int n=sandwiches.length;
        for(int i=n-1;i>=0;i--)
        {
            stk.push(sandwiches[i]);
        }
        for(int i=0;i<n;i++)
        {
            q.add(students[i]);
        }
        while(!stk.isEmpty() && !q.isEmpty())
        {
            int st=q.poll();
            int sd=stk.peek();
            if(sd==st)
            {
                stk.pop();
                f=0;
            }
            else
            {
                q.add(st);
                f++;
                if(f==q.size())
                {
                    res=q.size();
                    break;
                }
            }
        }
        return res;
    }
}