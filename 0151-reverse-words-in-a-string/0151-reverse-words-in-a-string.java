class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        int left=0,right=arr.length-1;
        while(left<right)
        {
            if(arr[left].length()==0)
            {
                left++;
                //continue;
            }
            else if(arr[right].length()==0)
            {
                right--;
                //continue;
            }
            else
            {
                String temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            //System.out.println(Arrays.toString(arr));
        }
        String res="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()!=0)
            {
                res+=arr[i];
                if(i!=arr.length-1)
                {
                    res+=" ";
                }
            }
        }
        return res;
    }
}