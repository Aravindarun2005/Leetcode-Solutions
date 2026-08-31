class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxlen=-1;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int l=0;
        int r=0;
        while(r<nums.length)
        {
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            while(hm.get(nums[r])>k)
            {
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0)
                    hm.remove(nums[l]);
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}