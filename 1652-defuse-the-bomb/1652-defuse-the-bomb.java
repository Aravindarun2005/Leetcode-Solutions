class Solution {
    public int[] decrypt(int[] code, int k) {
         int[] res=new int[code.length];
        if(k==0)
        {
            Arrays.fill(code,0);
            return code;
        }
        else if(k>0)
        {
            for(int i=0;i<code.length;i++)
            {
                int l=(i+1)%code.length;
                int r=l,c=0,sum=0;
                while(c<k)
                {
                    sum+=code[r];
                    c++;
                    r=(r+1)%code.length;
                }
                res[i]=sum;
            }
        }
        else
        {
            for(int i=0;i<code.length;i++)
            {
                k=Math.abs(k);
                int c=0,sum=0;
                int l=(i-1)%code.length;
                if(l<0)
                    l=code.length-1;
                int r=l;
                while(c<k)
                {
                    sum+=code[r];
                    c++;
                    r=(r-1)%code.length;
                    if(r<0)
                        r=code.length-1;
                }
                res[i]=sum;
            }
        }
        return res;
    }
}