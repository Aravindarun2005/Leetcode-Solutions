class Solution {
    public int strStr(String haystack, String needle) {
        int res=-1;
        int left=0;
        for(int right=needle.length()-1;right<haystack.length();right++)
        {
            if(check(haystack,needle,left,right))
            {
                return left;
            }
            left=left+1;
            //right+=needle.length()-1;
            if(right>haystack.length())
                break;
        }
        return res;        
    }
    public boolean check(String temp,String temp2,int left,int right)
    {
        String c=temp.substring(left,right+1);
        System.out.println(c);
        if(c.equals(temp2))
            return true;
        else
            return false;
    }
}