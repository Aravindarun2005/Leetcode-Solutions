class Solution {
    public int largestAltitude(int[] gain) {
        int[] psarr=new int[gain.length+1];
        psarr[0]=0;
        int k=1;
        for(int i=0;i<gain.length;i++)
        {
            psarr[k]=psarr[k-1]+gain[i];
            k++;
        }
        Arrays.sort(psarr);
        return psarr[psarr.length-1];
    }
}