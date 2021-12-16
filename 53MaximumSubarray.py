#First lc completed in python3

# Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and
# return its sum.
# A subarray is a contiguous part of an array.

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        lst = [0 for i in range(len(nums))]
        lst[0] = nums[0]
        
        for i in range(1, len(nums)):
            lst[i] = max(lst[i-1] + nums[i], nums[i])
       
        return max(lst)
