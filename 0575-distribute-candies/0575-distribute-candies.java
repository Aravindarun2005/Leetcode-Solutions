class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs=new HashSet<>();
        int len=candyType.length/2;
        for(int i=0;i<candyType.length;i++)
        {
            hs.add(candyType[i]);
        }
        if(len==hs.size())
            return hs.size();
        if(len<hs.size())
            return len;
        else
            return hs.size();
    }
}