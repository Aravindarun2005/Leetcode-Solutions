class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> hm=new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        ArrayList<String> res=new ArrayList<>();
        res.add("");
        if(digits.length()==0)
            return res;
        for(char digit:digits.toCharArray())
        {
            ArrayList<String> temp=new ArrayList<>();
            String letters=hm.get(digit);
            for(String s:res)
            {
                if(letters==null)
                {
                    continue;
                }
                for(char ch:letters.toCharArray())
                {
                    temp.add(s+ch);
                }
            }
            res=temp;
        }
        return res;
        
        
    }
}