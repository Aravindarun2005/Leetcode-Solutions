class Solution {
    public int firstUniqChar(String s) {
        int res=-1;
        Queue<Character> q=new LinkedList<>();
        int[] c=new int[26];
        for(char ch:s.toCharArray())
        {
            q.add(ch);
            c[ch-'a']++;
            while(!q.isEmpty() && c[q.peek()-'a']>1)
            {
                q.poll();
            }
        }
        if(q.isEmpty())
        {
            res=-1;
        }
        else
        {
            char ch=q.peek();
            for(int i=0;i<s.length();i++)
            {
                if(ch==s.charAt(i))
                {
                    res=i;
                    break;
                }
            }
        }

        return res;
    }
}