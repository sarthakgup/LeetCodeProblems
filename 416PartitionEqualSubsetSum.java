// Given an array of integers greater than zero,
// find if it is possible to split it in two (without reordering the elements),
// such that the sum of the two resulting arrays is the same.
// Print the resulting arrays.


class Solution {
    public static void main(String[] args)
    {
        int[] arrVals = {1,2,4,5,2};

        System.out.println(canPartition(arrVals));
    }

    public static boolean canPartition(int[] nums) {
        //1,2,4,  |  5,2
        int fullsum = 0;
        int leftsum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            fullsum += nums[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            leftsum += nums[i];

            if(leftsum == (fullsum - leftsum))
            {
                return true;
            }
        }

        return false;
    }
}
