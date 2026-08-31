class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int k=0;
        while(k<words.length)
        {
            String temp=con(words,k);
            if(temp.equals(s))
                return true;
            k++;
        }
        return false;
    }
    String con(String[] words,int k)
    {
        String t="";
        for(int i=0;i<=k;i++)
        {
            t+=words[i];
        }
        return t;
    }
}