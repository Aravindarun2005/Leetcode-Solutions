class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int res1=-1;
        int res2=-1;
        while(left<right)
        {
            if(numbers[left]+numbers[right]==target)
            {
                res1=left;
                res2=right;
                break;
            }
            else if(numbers[left]+numbers[right]>target)
            {
                right=right-1;
            }
            else
            {
                left=left+1;
            }
            //left++;
            //right--;
        }
        System.out.println(res1);
        System.out.println(res2);
        return new int[]{res1+1,res2+1};
    }
}