class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        int min=Math.min(first.length(),last.length());
        while(i<min && first.charAt(i)==last.charAt(i))
        {
            i++;
        }
        return first.substring(0,i);
        
    }
}