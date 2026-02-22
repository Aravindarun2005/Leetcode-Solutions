class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while(n!=1)
        {
            if(hs.contains(n))
                return false;
            else
                hs.add(n);
            n=sqr(n);
        }
        return true;
        
    }
    public int sqr(int n)
    {
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
}