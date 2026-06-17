class Solution {
    public int minSteps(String s, String t) {
        int freq[]=new int[26];
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        for(int i=0;i<s1.length;i++)
        {
            freq[s1[i]-'a']++;
        }
        for(int i=0;i<s2.length;i++)
        {
            freq[s2[i]-'a']--;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
            {
                count+=freq[i];
            }
        }
        return count;
    }
}