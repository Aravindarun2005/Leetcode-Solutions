class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum=0;
        int i;
        for(i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        long maxsum=sum;
        for(i=k;i<nums.length;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return (double) maxsum/k;
    }
}