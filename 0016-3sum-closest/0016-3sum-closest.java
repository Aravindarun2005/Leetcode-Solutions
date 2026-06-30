class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=-1,dis=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];
                int tempdis=Math.abs(target-sum);
                if(tempdis<dis)
                {
                    res=sum;
                    dis=tempdis;
                }
                if(sum<target)
                    left++;
                else if(sum>target)
                    right--;
                else
                    return sum;
                
            }
        }
        return res;     
    }
}