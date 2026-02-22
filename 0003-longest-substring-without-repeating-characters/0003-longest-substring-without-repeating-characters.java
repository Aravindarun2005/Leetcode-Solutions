class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        
        int max = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Use a boolean array to track characters for the current start index 'i'
            boolean[] seen = new boolean[256]; 
            
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                
                // If we hit a duplicate, this start index 'i' can't produce 
                // any longer unique substrings. BREAK and move to i+1.
                if (seen[ch]) {
                    break; 
                }
                
                seen[ch] = true;
                // Update max length incrementally
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}
