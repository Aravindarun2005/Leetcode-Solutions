class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs=new HashSet<Integer>();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
            {
                ar.add(nums[i]);
            }
            hs.add(nums[i]);
        }
        return ar;
        
    }
}