class Solution {
    public void sortColors(int[] nums) {
        int count[]=new int[3];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                count[0]++;
            else if(nums[i]==1)
                count[1]++;
            else
                count[2]++;
        }
        int k=0;
        for(int color=0;color<3;color++)
        {
            while(count[color]>0)
            {
                nums[k++]=color;
                count[color]--;
            }
        }
        
    }
}