class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(!stk.isEmpty())
                {
                    str+='(';
                }
                stk.push(s.charAt(i));
            }
            else
            {
                stk.pop();
                if(!stk.isEmpty())
                {
                    str+=')';
                }
            }
        }
        return str;
    }
}