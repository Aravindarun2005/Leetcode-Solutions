class Solution {
    public int longestConsecutive(int[] nums){ 
        if(nums.length==0)
            return 0;
        int currnum,currstreak=1,longstreak=1;
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums)
            hs.add(num);
        for(int num:hs)
        {
            if(!hs.contains(num-1))
            {
                currnum=num;
                currstreak=1;
                while(hs.contains(currnum+1))
                {
                    currnum+=1;
                    currstreak+=1;
                }
                 longstreak=Math.max(longstreak,currstreak);
            }
        }
        return longstreak;
    }
}