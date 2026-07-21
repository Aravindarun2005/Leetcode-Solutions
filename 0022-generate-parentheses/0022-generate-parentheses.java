class Solution {
    List<String> ar=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate("",0,0,n);
        return ar;
    }
    void generate(String str,int open,int close,int pairs)
    {
        if(open==pairs && close==pairs)
        {
            ar.add(str);
            return;
        }
        if(open<pairs)
        {
            generate(str+"(",open+1,close,pairs);
        }
        if(close<open)
        {
            generate(str+")",open,close+1,pairs);
        }
    }
}