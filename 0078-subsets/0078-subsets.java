class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int num:nums)
        {
            int size=res.size();
            for(int i=0;i<size;i++)
            {
                ArrayList<Integer> newsubset=new ArrayList<>(res.get(i));
                newsubset.add(num);
                res.add(newsubset);
            }
        }
        return res;
    }
}