/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
*/

//adding comment

class RemoveDuplicatesFromSortedArray
{
    public int removeDuplicates(int[] nums)
    {
        //checking corner case
        if (nums.length == 0)
        {
            return 0;
        }
        
        int i = 0;
        
        for (int j = 1; j < nums.length; j++)
        {
            if (nums[j] != nums[i])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        
        //returning length
        //return nums.length;
        return i + 1;
    }

    //Judge Code:
    //The judge will test your solution with the following code:
    public void testCode()
    {
        int[] nums = {1,2,3}; // Input array
        int[] expectedNums = {1,2,3}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;

        for (int i = 0; i < k; i++)
        {
            assert nums[i] == expectedNums[i];
        }
    }
}
