class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefproduct=new int[nums.length];
        int[] suffproduct=new int[nums.length];
        prefproduct[0]=1;
        suffproduct[nums.length-1]=1;
        for(int i=1;i<nums.length;i++)
            prefproduct[i]=nums[i-1]*prefproduct[i-1];
        for(int i=nums.length-2;i>=0;i--)
            suffproduct[i]=nums[i+1]*suffproduct[i+1];
        for(int i=0;i<nums.length;i++)
            nums[i]=prefproduct[i]*suffproduct[i];
        return nums;
    }
}