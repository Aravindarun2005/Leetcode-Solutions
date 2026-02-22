class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] res=new int[deck.length];
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        for(int i=deck.length-1;i>=0;i--)
        {
            if(!dq.isEmpty())
            {
                dq.addFirst(dq.removeLast());
            }
            dq.addFirst(deck[i]);
        }
        int k=0;
        Iterator<Integer> it=dq.iterator();
        while(it.hasNext())
        {
            res[k]=it.next();
            k++;
        }
        return res;
        
    }
}