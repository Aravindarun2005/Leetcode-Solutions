class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        for(String str:strs)
        {
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String temp=String.valueOf(arr);
            if(!hm.containsKey(temp))
            {
                hm.put(temp,new ArrayList<>());
            }
            hm.get(temp).add(str);
        }
        List<List<String>> res=new ArrayList<>();
        for(String t:hm.keySet())
        {
            res.add(hm.get(t));
        }
        return res;
    }
}