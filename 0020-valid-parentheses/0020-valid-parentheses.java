class Solution {
    public boolean isValid(String s) {
        Stack stk=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
            {
                stk.push(s.charAt(i));
            }
            if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')')
            {
                if(stk.isEmpty())
                    return false;
                Object item=stk.pop();
                char ch=(char)item;
                if(ch=='[' && s.charAt(i)!=']'||ch=='{' && s.charAt(i)!='}'||ch=='(' && s.charAt(i)!=')')
                {
                    return false;
                }
            }
        }
        if(stk.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}