class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        Integer[] res=new Integer[nums.length];
        for(int i=0;i<res.length;i++)
        {
            res[i]=nums[i];
        }
        Arrays.sort(res,new Comparator<Integer>()
        {
            public int compare(Integer a,Integer b)
            {
                int freqa=hm.get(a);
                int freqb=hm.get(b);
                if(freqa<freqb)
                {
                    return -1;
                }
                else if(freqa>freqb)
                {
                    return 1;
                }
                else
                {
                    if(a>b)
                    {
                        return -1;
                    }
                    else if(a<b)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
        });
        int[] ans=new int[res.length];
        for(int i=0;i<res.length;i++)
        {
            ans[i]=res[i];
        }
        return ans;
    }
}