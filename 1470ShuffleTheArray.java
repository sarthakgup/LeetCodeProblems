// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        int x = 0;
        
        for(int i = 0; i < n; i++)
        {
            shuffled[i+i] = nums[i];
            shuffled[i+i+1] = nums[n+i];
        }
        
        return shuffled;
    }
}
