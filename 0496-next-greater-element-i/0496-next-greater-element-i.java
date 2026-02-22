class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums2.length];
        for(int i=0;i<nums2.length;i++)
        {
            res[i]=nums2[i];
        }
        Stack<Integer> stk=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!stk.isEmpty() && stk.peek()<=nums2[i])
            {
                stk.pop();
            }
            if(stk.isEmpty())
            {
                stk.push(nums2[i]);
                nums2[i]=-1;
            }
            else
            {
                int temp=nums2[i];
                nums2[i]=stk.peek();
                stk.push(temp);
            }
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            hm.put(nums1[i],i);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(hm.containsKey(res[i]))
            {
                int ind=hm.get(res[i]);
                nums1[ind]=nums2[i];
            }
        }
        //System.out.println(Arrays.toString(nums1));
        return nums1;
    }
}