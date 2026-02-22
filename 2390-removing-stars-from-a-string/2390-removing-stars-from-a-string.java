class Solution {
    public String removeStars(String s) {
        Stack<Character> stk=new Stack<>();
        Stack<Character> stk2=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
                if(!stk.isEmpty() && s.charAt(i)=='*')
                    stk.pop();
                else
                    stk.push(s.charAt(i));
                
        }
        while(!stk.isEmpty())
        {
            stk2.push(stk.pop());
        }
        String str="";
        while(!stk2.isEmpty())
        {
            str+=stk2.pop();
        }
        return str;

        
    }
}