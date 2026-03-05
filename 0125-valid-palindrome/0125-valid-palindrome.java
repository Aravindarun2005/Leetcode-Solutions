class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                str+=Character.toLowerCase(s.charAt(i));
        }
        int right=str.length()-1;
        System.out.println(str);
        while(left<right)
        {
            while(left<right && !Character.isLetterOrDigit(str.charAt(left)))
            {
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(str.charAt(right)))
            {
                right--;
            }
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}