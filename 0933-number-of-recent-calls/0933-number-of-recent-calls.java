class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q=new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        int count=0,low=t-3000,high=t;
        for(int ele:q)
        {
            if(ele>=low && ele<=high)
                count++;
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */