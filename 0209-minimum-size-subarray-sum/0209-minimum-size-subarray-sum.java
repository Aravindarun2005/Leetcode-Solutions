class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE,tempsum=0;
        int left=0,right=0;
        for(right=0;right<nums.length;right++)
        {
            tempsum+=nums[right];
            while(tempsum>=target)
            {
                minlen=Math.min(minlen,right-left+1);
                tempsum-=nums[left];
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}