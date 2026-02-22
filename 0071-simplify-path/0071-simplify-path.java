class Solution {
    public String simplifyPath(String path) {
        String[] parts=path.split("/");
        Stack<String> stk=new Stack<>();
        Stack<String> stk2=new Stack<>();
        for(String str:parts)
        {
            if(!str.equals("") && !str.equals("."))
            {
                if(str.equals(".."))
                {
                    if(!stk.isEmpty())
                        stk.pop();
                }
                else
                {
                    stk.push(str);
                }
            }
        }
        String str="";
        while(!stk.isEmpty())
        {
            stk2.push(stk.pop());
        }
        while(!stk2.isEmpty())
        {
            str+='/'+stk2.pop();
        }
        return str.length()==0?"/":str;
    }
}