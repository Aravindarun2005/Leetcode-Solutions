class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        ArrayList<Character> ar=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='O'||arr[i]=='U'||arr[i]=='I')
            {
                ar.add(arr[i]);
                ar2.add(i);
            }
        }
        int temp=ar.size()-1;
        for(int k:ar2)
        {
            arr[k]=ar.get(temp);
            temp--;
        }
        return String.valueOf(arr);
    }
}