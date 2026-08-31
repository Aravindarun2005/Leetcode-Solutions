class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int len = arr.length - 1;
        
        while (!sorted(arr)) {
            int maxind = findmax(arr, len);
            if (maxind != 0) {
                flip(arr, maxind);
                res.add(maxind + 1);
            }
            flip(arr, len);
            res.add(len + 1);
            len--;
        }
        return res;
    }
    
    void flip(int[] arr, int k) {
        int left = 0, right = k;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    int findmax(int[] arr, int limit) {
        int max = -1, ind = 0;
        for (int i = 0; i <= limit; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ind = i;
            }
        }
        return ind;
    }
    
    boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
