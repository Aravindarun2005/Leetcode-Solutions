class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        //System.out.println(arr[arr.length-1]);
        String res=arr[arr.length-1];
        return res.length();
    }
}