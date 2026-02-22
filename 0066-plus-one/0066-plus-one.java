import java.math.*;
class Solution {
    public int[] plusOne(int[] digits) {
        String str="";
        for(int a:digits)
        {
            str=str+a;
        }
        BigInteger num=new BigInteger(str);
        BigInteger b=new BigInteger("1");
        BigInteger sum=num.add(b);
        String s=sum.toString();
        //System.out.println(s);
        int[] res=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            res[i]=s.charAt(i)-'0';
        }
        return res;
        
    }
}