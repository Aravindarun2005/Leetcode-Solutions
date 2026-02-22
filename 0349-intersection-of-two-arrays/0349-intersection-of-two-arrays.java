class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            hs.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(hs.contains(nums2[i]))
            {
                if(!hs2.contains(nums2[i]))
                {
                    ar.add(nums2[i]);
                    hs2.add(nums2[i]);
                }

            }
        }
        int[] res=new int[ar.size()];
        for(int k=0;k<ar.size();k++)
        {
            res[k]=ar.get(k);
        }
        return res;
        
    }
}