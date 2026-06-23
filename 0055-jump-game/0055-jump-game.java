class Solution {
    public boolean canJump(int[] nums) {
        int left=0;
        int right=0;
        int far=Integer.MIN_VALUE;
        while(left<=right)
        {
            if(right>=nums.length-1)
                return true;
            for(int i=left;i<=right;i++)
            {
                far=Math.max(far,i+nums[i]);
            }
            left=right+1;
            right=far;
        }
        return false;
    }
}