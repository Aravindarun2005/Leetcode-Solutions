class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] visit=new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0 && nums[i]<=nums.length)
            {
                visit[nums[i]-1]=true;
            }
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!visit[i-1])
                return i;
        }
        return nums.length+1;
    }
}