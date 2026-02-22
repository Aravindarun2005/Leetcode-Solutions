class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int var=0;
        for(int i=0;i<nums.length;i++)
        {
            if(var!=nums[i])
            {
                return var;
            }
            var+=1;
        }
        return var;

    }
}