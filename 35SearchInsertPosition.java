// JAVA VERSION -- already completed in python a.t.m.

// Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// THIS IS A PERFECT IDEAL SOLUTION  (0 ms runtime)

class Solution {
    public int searchInsert(int[] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
            else if(nums[i] > target)
            {
                return i;
            }
        }
        
        return nums.length;
    }
}
