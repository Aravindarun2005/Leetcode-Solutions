class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> stk=new Stack<>();
        int[] res=new int[heights.length];
        res[heights.length-1]=0;
        stk.push(heights[heights.length-1]);
        for(int i=heights.length-2;i>=0;i--)
        {
            int c=0;
            if(heights[i]<stk.peek())
            {
                c+=1;
                stk.push(heights[i]);
            }
            else
            {
                while(!stk.isEmpty() && heights[i]>stk.peek())
                {
                    c+=1;
                    stk.pop();
                }
                if(!stk.isEmpty())
                {
                    c+=1;
                }
                stk.push(heights[i]);
            }
            res[i]=c;
        }
        return res;
    }
}