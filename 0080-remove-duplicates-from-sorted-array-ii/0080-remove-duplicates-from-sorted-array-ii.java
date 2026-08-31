class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2)
            return nums.length;
        int k=2,i=2;
        while(i<nums.length)
        {
            if(nums[i]!=nums[k-2])
            {
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}