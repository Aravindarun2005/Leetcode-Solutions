class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(int x:hm.keySet())
        {
            if(hm.containsKey(x+1))
            {
                ans=Math.max(ans,hm.get(x)+hm.get(x+1));
            }
        }
        return ans;
        
    }
}