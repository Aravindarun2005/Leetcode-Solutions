class Solution {
    public int jump(int[] nums) {
        int left=0,right=0,jumps=0,far=Integer.MIN_VALUE;
        while(left<=right)
        {
            if(right>=nums.length-1)
                break;
            for(int i=left;i<=right;i++)
            {
                far=Math.max(far,i+nums[i]);
            }
            left=right+1;
            right=far;
            jumps++;
        }
        return jumps;
    }
}