# Given a sorted array of distinct integers and a target value, return the index if the target is found.
# If not, return the index where it would be if it were inserted in order.

# 56 ms runtime (did a perfect time solution in Java

# You must write an algorithm with O(log n) runtime complexity.

class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if target in nums:
            return nums.index(target)
        else:
            for j in nums:
                k = 0
                print(j)
                if j > target:
                    print(nums.index(j))
                    return nums.index(j)
                #elif k == len(nums)-1 and j < target:
                #    return nums.index(j)+1
                
                k+=1
                
                
        return len(nums)
