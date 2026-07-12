class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> ts=new TreeSet<>();
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            ts.add(arr[i]);
        }
        int pos=1;
        for(int num:ts)
        {
            hm.put(num,pos);
            pos++;
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}