/*
DESCRIPTION:
    Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
    return the number of negative numbers in grid.
*/

class Solution {
    public int countNegatives(int[][] grid)
    {
        int negCounter = 0;
        
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] < 0)
                {
                    negCounter++;
                }
            }
        }
        
        return negCounter;
    }
}