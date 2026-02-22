class Solution {
    public int findTheWinner(int n, int k) {
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        int ind=0;
        while(arr.length!=1)
        {
            ind=(ind+k-1)%arr.length;
            arr=del(arr,ind);
        }
        return arr[0];
        
    }
    public int[] del(int arr[],int pos)
    {
        int[] res=new int[arr.length-1];
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
                if(i==pos)
                    continue;
                res[c++]=arr[i];
        }
        return res;
    }
}