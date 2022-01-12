class Solution {
    public int climbStairs(int n) {
        if (n == 1)
        {
            return 1;
        }
        
        int first = 1;
        int second = 2;
        
      //starting i at 3 to account for 1st 2 steps i hardcoded
        for (int i = 3; i <= n; i++)
        {
            int third = first + second;
            first = second;
            second = third;
        }
        
        return second;
    }
}
