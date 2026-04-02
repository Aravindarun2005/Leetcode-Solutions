class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left=0,right=0;
        while(left<nums1.length && right<nums2.length)
        {
            if(nums1[left]==nums2[right])
            {
                ar.add(nums1[left]);
                left++;
                right++;
            }
            else if(nums1[left]<nums2[right])
            {
                left++;
            }
            else
                right++;
        }
        int[] a=new int[ar.size()];
        int k=0;
        for(int i:ar)
        {
            a[k]=i;
            k++;
        }
        return a;
    }
}