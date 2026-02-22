class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        ArrayList<Integer> ar=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int val=hm.get(nums[i]);
                hm.put(nums[i],val+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        //System.out.println(hm);
        for(int key:hm.keySet())
        {
            int temp=hm.get(key);
            if(temp>n)
            {
                ar.add(key);
            }
        }
        return ar;
        
    }
}