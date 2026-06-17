class Solution {
    public int numRescueBoats(int[] people, int limit) {
       int boats=0;
       int temp=limit;
       Arrays.sort(people);
       int l=0,r=people.length-1;
       while(l<=r)
       {
            if(l==r)
            {
                if(people[l]<=limit)
                {
                    boats+=1;
                    l++;
                    r--;
                    continue;
                }
            }
            if(people[l]+people[r]<=limit)
                l++;
            r--;
            boats+=1;
       }
       return boats; 
    }
}