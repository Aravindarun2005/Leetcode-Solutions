class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int val=hm.get(nums[i]);
                val+=1;
                hm.put(nums[i],val);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int k=-1,v=-1;
        for(int num:hm.keySet())
        {
            if(hm.get(num)>nums.length/2  && hm.get(num)>v )
            {
                k=num;
                v=hm.get(num);
            }
        }
        return k;
    }
}