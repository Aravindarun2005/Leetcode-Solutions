
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        for(int i=0;i<tickets.length;i++)
        {
            q1.add(tickets[i]);
            q2.add(i);
        }
        int time=0;
        while(!q1.isEmpty())
        {
            time+=1;
            int temp=q1.poll();
            temp-=1;
            if(temp==0 && q2.peek()==k)
            {
                return time;
            }
            if(temp==0 && q2.peek()!=k)
            {
               q2.poll(); 
            }
            if(temp!=0)
            {
                q1.add(temp);
                int t=q2.poll();
                q2.add(t);
            }

        }
      return time;  
    }
}